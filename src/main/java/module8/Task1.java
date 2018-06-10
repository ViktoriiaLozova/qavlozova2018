package module8;
/*
Задание 1
Осуществить сжатие английского текста, заменив каждую группу из двух или более рядом стоящих символов,
на один символ, за которым следует количество его вхождений в группу. К примеру, строка hellowoooorld должна сжиматься в hel2owo4rld.
В случае если в тексте будет присутствовать цифра в единичном экземпляре перед ней необходимо поставить цифру 1.
Например, строка He4lo будет преобразована в He14lo

Также если количество повторений будет превышать 9 используйте несколько повторений.
Например, строка heloooooooooo будет преобразована в hel9oo. Строка heloooooоooooo будет преобразована в  hel9o2o

Реализуйте возможность распаковки текста, сжатого по этому правилу. В случае если распаковка не возможна метод распаковки
должен выбросить checked exception.
 */

import java.util.List;

public class Task1 {

    public static String compress(String source) {
        String codedNumbers = "";
        for (int i = 0; i < source.length(); i++) {
            char charFromString = source.charAt(i);
            if (isNumber(charFromString)) {
                codedNumbers = codedNumbers + "1";
            }
            codedNumbers = codedNumbers + charFromString;
        }

        String resultCompress = "";
        for (int i = 0; i < codedNumbers.length();) {
            char doubleChar = codedNumbers.charAt(i);
            int count = 1;
            while (doubleChar != '1' && i + count < codedNumbers.length() && doubleChar == codedNumbers.charAt(i + count) && count < 9) {
                count++;
            }
            resultCompress = resultCompress + doubleChar;
            if (count > 1) {
               resultCompress = resultCompress + count;
            }
            i = i + count;
        }
        return resultCompress;

    }

    private static boolean isNumber(char symbol){
        char[] numbers = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        for (int i = 0; i < numbers.length; i++) {
            if (symbol == numbers[i]) {
                return true;
            }
        }
        return false;
    }

    private static String decompress(String source) throws Exception {
      String decodedChars = "";
        for (int i = 0; i < source.length(); i++) {
            char charFromstring = source.charAt(i);
            if (charFromstring == '1' && !isNumber(source.charAt(i + 1)) && source.charAt(i - 1) != '1'
                    || isNumber(charFromstring) && charFromstring != '1' && i == 0
                    || charFromstring == '0' && source.charAt(i - 1) != '1') {
                throw new Exception("Decoding error");
            }
            char nextChar = source.charAt(i + 1);
            if (!isNumber(charFromstring) && isNumber(nextChar) && nextChar != '1') {
                for (int j = 0; j < Character.getNumericValue(nextChar); j++) {
                    decodedChars = decodedChars + charFromstring;
                }
                i++;
            } else {
                decodedChars = decodedChars + charFromstring;
            }
        }
        decodedChars = decodedChars.replace("11", "_");
        decodedChars = decodedChars.replace("1", "");
        return decodedChars.replace("_", "1");
    }

    public static void main(String[] args) throws Exception {
        String source = "1100Hellooo66rrrrrrrrrrrdd";
        String compressResult = compress(source);
        System.out.println(compressResult);
        String decompressResult = decompress(compressResult);
        System.out.println(decompressResult);

    }

}

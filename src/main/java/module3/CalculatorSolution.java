package module3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static module3.Calculator.*;


/**
 * Задание 1
 * Напишите приложение калькулятор состоящие из двух классов: первый класс выполняет базовые операции такие как
 * сложение, вычитание, умножение и деление
 * второй класс использует первый
 * Методы сложения, вычитания, деления и умножения должны быть
 * статическими
 * Дополните первый класс методами реализующими память: добавление в память, вычитание из памяти и очистка памяти
 * (аналоги кнопок M+, M- и MR в обычном калькуляторе)
 * Методы для работы с памятью должны быть НЕ статическими
 */
public class CalculatorSolution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter value 1: ");
        String input1 = reader.readLine();
        double number1 = Double.parseDouble(input1);

        System.out.println("Please enter value 2: ");
        String input2 = reader.readLine();
        double number2 = Double.parseDouble(input2);

        System.out.println("Sum: " + add(number1, number2));
        System.out.println("Subtraction: " + sub(number1, number2));
        System.out.println("Multiplication: " + mult(number1, number2));
        System.out.println("Division: " + div(number1, number2));

        Calculator m = new Calculator();

        System.out.println("Please enter value for adding to memory: ");
        String addMemoryValue = reader.readLine();
        double addMemoryNumber = Double.parseDouble(addMemoryValue);

        m.addToMemory(addMemoryNumber);
        System.out.println("Result after adding to memory: " + m.resultMemory());

        System.out.println("Please enter value for subtraction from memory: ");
        String subMemoryValue = reader.readLine();
        double subMemoryNumber = Double.parseDouble(subMemoryValue);

        m.subFromMemory(subMemoryNumber);
        System.out.println("Result after subtraction from memory: " + m.resultMemory());

        m.cleanMemory();
        System.out.println("Result after memory cleaning: " + m.resultMemory());
    }
}

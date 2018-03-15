package module2;

/**
 Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd,
 or “Even Number” otherwise.
 */
public class CheckOddEven {
    public static void checkOddEven(int number){
        if (number % 2 != 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }

    public static void main(String[] args) {
        checkOddEven(5);
    }
}

package module2;

/**
 * Write a Java program by loops to print the following pattern:
 * 1******
 * 12*****
 * 123****
 * 1234***
 * 12345**
 * 123456*
 * 1234567
 */
public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int n = 1; n <= i; n++) {
                System.out.print(n);
            }
            for (int j = i; j <= 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

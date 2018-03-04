package module1;

/**
 * Module_1. Working with variables
 */
public class QEquation {
    public static void main(String[] args) {
        double a = 0.5;
        double b = 45;
        double c = 2.5;
        double x1, x2;

        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}

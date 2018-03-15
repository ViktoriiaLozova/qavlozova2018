package module2;

/**
 * Write a program called ComputePI to compute the value of π (compare it with Math.PI)
 */
public class ComputePI {
    public static void main(String[] args) {
        double pi = 0;
        int iter = 100000000;
        for (int i = 0; i < iter; i++) {
            double denominator = 2 * i + 1;
            if (i % 2 == 0) {
                pi = pi + 4/denominator;
            } else {
                pi = pi - 4/denominator;
            }
        }
        System.out.println(pi);
        System.out.println(Math.PI);
    }
}
//      pi = 3.141592643589326
// Math.PI = 3.141592653589793
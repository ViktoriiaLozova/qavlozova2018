package module2;

/**
 * Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100.
 * Also compute and display the average.
 */

public class SumAndAverage {
    public static void sumAndAverage(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        double avg = sum / n;
        System.out.println(avg);
    }

    public static void main(String[] args) {
        sumAndAverage(100);
    }
}

package module2;

/**
 * Write a program called HarmonicSum to compute the sum of a harmonic series, as shown below, where n=50000
 * 𝐻𝑎𝑟𝑚𝑜𝑛𝑖𝑐=1+  1/2+1/3+…+1/𝑛
 */

public class HarmonicSum {
    public static void main(String[] args) {
        int n = 50000;
        double sum = 0;
        for (double i = 1; i < n; i++) {
            sum = sum + 1 / i;
        }
        System.out.println(sum);
    }
}


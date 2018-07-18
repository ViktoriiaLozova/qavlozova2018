package jUnitTask;

import java.util.Objects;

/**
 * Hаписать тесты для класса решения квадратного уравнения
 *
 * Добавить тесты с параметрами
 */
public class QEquation {
    public static Pair qEquation(double a, double b, double c) {
        double x1;
        double x2;
        if (a == 0) {
            throw new ArithmeticException("Division by zero");
        }
        x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
        return new Pair(x1, x2);
    }

    public static class Pair {
        double first;
        double second;

        public Pair(double first, double second) {
            this.first = first;
            this.second = second;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return Double.compare(pair.first, first) == 0 &&
                    Double.compare(pair.second, second) == 0;
        }

        @Override
        public int hashCode() {
            return Objects.hash(first, second);
        }
    }

    public static class Triple {
        double first;
        double second;
        double third;

        public Triple(double first, double second, double third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }

        public double getFirst() {
            return first;
        }

        public double getSecond() {
            return second;
        }

        public double getThird() {
            return third;
        }
    }
}

package module3;

/**
 * Задание 1
 * Напишите приложение калькулятор состоящие из двух классов: первый класс выполняет базовые операции такие как
 * сложение, вычитание, умножение и деление
 * второй класс использует первый
 * Методы сложения, вычитания, деления и умножения должны быть
 * статическими
 * Дополните первый класс методами реализующими память: добавление в память, вычитание из памяти и очистка памяти
 * (аналоги кнопок M+, M- и MR в обычном калькуляторе)Методы для работы с памятью должны быть НЕ статическими
 */

public class Calculator {
    double memory = 0;

    public static double add(double a1, double a2) {
        return a1 + a2;
    }

    public static double sub(double s1, double s2) {
        return s1 - s2;
    }

    public static double mult(double m1, double m2) {
        return m1 * m2;
    }

    public static double div(double d1, double d2) {
        if (d2 != 0) {
            return d1 / d2;
        } else
            System.out.println("Division on zero");
        return Double.NaN;
    }

    public double addToMemory(double addmem) {
        memory = memory + addmem;
        return memory;
    }

    public double subFromMemory(double submem) {
        memory = memory - submem;
        return memory;
    }

    public double resultMemory() {
        return memory;
    }

    public void cleanMemory() {
        memory = 0;
        System.out.println("Memory was cleaned.");
    }
}

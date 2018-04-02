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

    public static double add(double addValue1, double addValue2) {
        return addValue1 + addValue2;
    }

    public static double sub(double subValue1, double subValue2) {
        return subValue1 - subValue2;
    }

    public static double mult(double multValue1, double multValue2) {
        return multValue1 * multValue2;
    }

    public static double div(double divValue1, double divValue2) {
        if (divValue2 != 0) {
            return divValue1 / divValue2;
        } else
            throw new ArithmeticException("Division on zero is forbidden");
    }

    public double addToMemory(double addToMemoryValue) {
        memory = memory + addToMemoryValue;
        return memory;
    }

    public double subFromMemory(double subFromMemoryValue) {
        memory = memory - subFromMemoryValue;
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

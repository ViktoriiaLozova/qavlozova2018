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
        String inputStringValue1 = reader.readLine();
        double valueForCalculation1 = Double.parseDouble(inputStringValue1);

        System.out.println("Please enter value 2: ");
        String inputStringValue2 = reader.readLine();
        double valueForCalculation2 = Double.parseDouble(inputStringValue2);

        System.out.println("Sum: " + add(valueForCalculation1, valueForCalculation2));
        System.out.println("Subtraction: " + sub(valueForCalculation1, valueForCalculation2));
        System.out.println("Multiplication: " + mult(valueForCalculation1, valueForCalculation2));
        System.out.println("Division: " + div(valueForCalculation1, valueForCalculation2));

        Calculator calc = new Calculator();

        System.out.println("Please enter value for adding to memory: ");
        String addMemoryValue = reader.readLine();
        double addMemoryNumber = Double.parseDouble(addMemoryValue);

        calc.addToMemory(addMemoryNumber);
        System.out.println("Result after adding to memory: " + calc.resultMemory());

        System.out.println("Please enter value for subtraction from memory: ");
        String subMemoryValue = reader.readLine();
        double subMemoryNumber = Double.parseDouble(subMemoryValue);

        calc.subFromMemory(subMemoryNumber);
        System.out.println("Result after subtraction from memory: " + calc.resultMemory());

        calc.cleanMemory();
        System.out.println("Result after memory cleaning: " + calc.resultMemory());
    }
}

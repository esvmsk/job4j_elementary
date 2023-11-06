package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second) + multiply(first, second);
    }

    public static double divAndDiff(double first, double second) {
        return div(first, second) + diff(first, second);
    }

    public static double x = sumAndMultiply(10, 20) + divAndDiff(20, 10);

    public static void main(String[] args) {
        System.out.println("Результат расчета sumAndMultiply равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета divAndDiff равен: " + divAndDiff(20, 10));
        System.out.println("Результат расчета divAndDiff равен: " + sumAndMultiply(10, 20) + "+" + divAndDiff(20, 10) + " = " + x);
    }
}

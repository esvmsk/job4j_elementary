package ru.job4j.calculator;

public class Plus {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Plus.plus(100, 500);
        Plus.plus(4, 2);
        Plus.plus(3, 5);
    }
}

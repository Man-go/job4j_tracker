package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int rsl = calculator.sumAllOperation(1);
        System.out.println(rsl);
    }

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int sumAllOperation(int y) {
        return sum(y) + multiply(y) + minus(y) + divide(y);
    }

}

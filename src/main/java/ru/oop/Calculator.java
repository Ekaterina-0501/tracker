package ru.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int z) {
        return z - x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int b) {
        return b / x;
    }

    public int sumAllOperation(int c) {
        return sum(c) + minus(c) + multiply(c) + divide(c);
    }

    public static void main(String[] args) {
        int result1 = Calculator.sum(-3);
        System.out.println(result1);
        int result2 = minus(7);
        System.out.println(result2);
        Calculator calculator = new Calculator();
        int result3 = calculator.multiply(3);
        System.out.println(result3);
        int result4 = calculator.divide(25);
        System.out.println(result4);
        int result5 = calculator.sumAllOperation(10);
        System.out.println(result5);
    }
}

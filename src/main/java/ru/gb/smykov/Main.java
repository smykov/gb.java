package ru.gb.smykov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(CheckSumNumbers(5, 8));

        CheckToPositive(-5);

        System.out.println(IntegerIsNegative(-8));
    }

    public static boolean CheckSumNumbers(int a, int b) {
        int min = 10, max = 20;
        int sum = a + b;

        return sum >= min && sum <= max;
    }

    public static void CheckToPositive(int a) {
        String result;

        if(a >= 0) {
            result = "positive";
        } else {
            result = "negative";
        }

        System.out.println(a + " is " + result);
    }

    public static boolean IntegerIsNegative(int a) {
        return a < 0;
    }
}

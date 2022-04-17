package ru.gb.smykov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(CheckSumNumbers(5, 8));
    }

    public static boolean CheckSumNumbers(int a, int b) {
        int min = 10, max = 20;
        int sum = a + b;

        return sum >= min && sum <= max;
    }
}

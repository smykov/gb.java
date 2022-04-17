package ru.gb.smykov;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println(checkSumNumbers(5, 8));

        checkToPositive(-5);

        System.out.println(integerIsNegative(-8));

        printNTimes("Hello world!!!", 5);

        for (int i = 0; i < 2023; i++) {
            if (isIntercalaryYear(i)){
                System.out.println(i + " is Intercalary Year");
            }
        }
    }

    public static boolean checkSumNumbers(int a, int b) {
        int min = 10, max = 20;
        int sum = a + b;

        return sum >= min && sum <= max;
    }

    public static void checkToPositive(int a) {
        String result;

        if(a >= 0) {
            result = "positive";
        } else {
            result = "negative";
        }

        System.out.println(a + " is " + result);
    }

    public static boolean integerIsNegative(int a) {
        return a < 0;
    }

    public static void printNTimes(String string, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(string);
        }
    }

    public static boolean isIntercalaryYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}

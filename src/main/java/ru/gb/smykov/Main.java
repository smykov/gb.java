package ru.gb.smykov;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("\nFirst task:");
        initArrayAndReversesValues();

        System.out.println("\nSecond task:");
        initArraySize100();

        System.out.println("\nThird task:");
        initArrayAndValuesLess6MultiplyBy2();

        System.out.println("\nFourth task:");
        fillArrayDiagonalsBy1();

        System.out.println("\nFifth task:");
        int[] array = getFillArray(5, 3);
        System.out.println(Arrays.toString(array));

        System.out.println("\nSixth task:");
        initArrayAndFindMinMaxValue();

        System.out.println("\nSeventh task:");

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10);
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(checkBalance(arr));


        System.out.println("\nSeventh task:");
        //Init random N
        int n = 0;
        while (n == 0) {
            n = new Random().nextInt(3);
        }
        if ((new Random().nextInt(2)) == 1) {
            n *= -1;
        }
        System.out.println("n = " + n);
        //Init random array
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(10);
        }
        System.out.println(Arrays.toString(a));

        a = moveArray(a, n);
        System.out.println(Arrays.toString(a));

    }

    private static int[] moveArray(int[] a, int n) {
        for (int i = 0; i < Math.abs(n); i++) {
            if (n > 0) {
                int lastValue = a[a.length - 1];
                for (int j = a.length - 1; j > 0; j--) {
                    a[j] = a[j - 1];
                }
                a[0] = lastValue;
            } else {
                int firstValue = a[0];
                for (int j = 0; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                a[a.length - 1] = firstValue;
            }
        }

        return a;
    }

    private static boolean checkBalance(int[] arr) {
        int indexLeftEdge = 0, indexRightEdge = arr.length - 1;
        int sumArrLeftEdge = arr[0], sumArrRightEdge = arr[arr.length - 1];

        while (indexLeftEdge + 1 != indexRightEdge || indexLeftEdge != indexRightEdge - 1) {

            if (sumArrLeftEdge < sumArrRightEdge || (sumArrLeftEdge == sumArrRightEdge && arr[indexLeftEdge + 1] < arr[indexRightEdge - 1])) {
                indexLeftEdge++;
                sumArrLeftEdge += arr[indexLeftEdge];
            } else if (sumArrLeftEdge > sumArrRightEdge || (sumArrLeftEdge == sumArrRightEdge && arr[indexLeftEdge + 1] > arr[indexRightEdge - 1])){
                indexRightEdge--;
                sumArrRightEdge += arr[indexRightEdge];
            }
        }
        System.out.printf("Left edge is [%d] = %d, right edge is [%d] = %d\n", indexLeftEdge, sumArrLeftEdge, indexRightEdge, sumArrRightEdge);

        return (sumArrLeftEdge == sumArrRightEdge);
    }

    private static void initArrayAndFindMinMaxValue() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(55);
        }

        System.out.println(Arrays.toString(array));

        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        System.out.printf("Min: %d, Max: %d\n", min, max);
    }

    private static int[] getFillArray(int len, int initialValue) {
        int[] array = new int[len];

        Arrays.fill(array, initialValue);

        return array;
    }

    private static void fillArrayDiagonalsBy1() {
        int[][] array = new int[10][10];

        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[i][(array.length - 1) - i] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }

    private static void initArrayAndValuesLess6MultiplyBy2() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
        }

        System.out.println(Arrays.toString(array));
    }

    private static void initArraySize100() {
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));
    }

    private static void initArrayAndReversesValues() {
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(2);
        }

        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
        }

        System.out.println(Arrays.toString(array));
    }
}

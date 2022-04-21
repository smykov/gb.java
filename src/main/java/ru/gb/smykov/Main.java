package ru.gb.smykov;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        initArrayAndReversesValues();

        initArraySize100();

        initArrayAndValuesLess6MultiplyBy2();

        fillArrayDiagonalsBy1();
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

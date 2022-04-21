package ru.gb.smykov;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        initArrayAndReversesValues();
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

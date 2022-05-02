package ru.gb.smykov.HM6;

import java.util.Random;

public class HM {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Барсик", 2, 1.5),
                new Dog("Бобик", 10, 15)
        };

        for (Animal animal : animals) {
            animal.print();
            animal.run(100);
            animal.swim(50);
            System.out.println();
        }
    }
}

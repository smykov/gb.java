package ru.gb.smykov.HM6;

import java.util.Random;

public class HM {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Барсик", 2, 1.5),
                new Dog("Бобик", 10, 15)
        };

        final Random random = new Random();
        for (Animal animal : animals) {
            animal.print();
            animal.run(random.nextInt(500));
            animal.swim(random.nextInt(50));
            System.out.println();
        }
        System.out.printf("Всего животных: %d\n", Animal.getCount());
        System.out.println("Cat.getCount() = " + Cat.getCount());
        System.out.println("Dog.getCount() = " + Dog.getCount());
    }
}

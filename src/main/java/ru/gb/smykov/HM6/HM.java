package ru.gb.smykov.HM6;

import java.util.Random;

public class HM {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{
                new Cat("Барсик", 1, 1.5, 1),
                new Cat("Мурзик", 4, 3.5, 2),
                new Cat("Малыш", 8, 7, 4),
                new Dog("Бобик", 10, 15, 5)
        };

        Plate plate = new Plate(5);
        plate.info();

        final Random random = new Random();
        for (Animal animal : animals) {
            animal.run(random.nextInt(500));
            animal.swim(random.nextInt(50));
            animal.eat(plate);
            animal.print();
            System.out.println();
        }
        System.out.printf("Всего животных: %d\n", Animal.getCount());
        System.out.println("Cat.getCount() = " + Cat.getCount());
        System.out.println("Dog.getCount() = " + Dog.getCount());

        plate.info();

    }
}

package ru.gb.smykov.HM6;

public class Cat extends Animal {
    public Cat(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public boolean run(int length) {
        if (length > 200) {
            System.out.println("Ошибка!!! Кот не может пробежать более 200м!");
            return false;
        }
        return super.run(length);
    }

    @Override
    public boolean swim(int length) {
        System.out.println("Ошибка!!! Кот не умеет плавать!");
        return false;
    }
}

package ru.gb.smykov.HM6;

public class Cat extends Animal {

    private static final int RUN_LIMIT = 200;
    private static final int SWIM_LIMIT = 0;
    private static int count;

    public Cat(String name, int age, double weight) {
        super(name, age, weight, RUN_LIMIT, SWIM_LIMIT);
        count++;
    }

    @Override
    public String toString() {
        return "Кот по имени " + getName();
    }

    public static int getCount() {
        return count;
    }

    @Override
    public void swim(int length) {
        System.out.printf("Ошибка!!! %s не умеет плавать!", this);
    }


}

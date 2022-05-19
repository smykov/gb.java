package ru.gb.smykov.HM6;

public class Dog extends Animal {

    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 50;
    private static int count;

    public Dog(String name, int age, double weight, int appetite) {
        super(name, age, weight, RUN_LIMIT, SWIM_LIMIT, appetite);
        count++;
    }

    @Override
    public String toString() {
        return "Собака по имени " + getName();
    }

    public static int getCount() {
        return count;
    }
}

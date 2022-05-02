package ru.gb.smykov.HM6;

public class Dog extends Animal {
    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public boolean run(int length) {
        if (length > 500) {
            System.out.println("Собака не может пробежать больше 500м");
            return false;
        }
        return super.run(length);
    }

    @Override
    public boolean swim(int length) {
        if (length > 10) {
            System.out.println("Собака не может проплыть больше 10м");
            return false;
        }
        return super.swim(length);
    }
}

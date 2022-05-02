package ru.gb.smykov.HM6;

public abstract class Animal {
   private String name;
    private int age;
    private double weight;

    public Animal(String name, int age, double weight) {
        this.name = name;
        this.age = setAge(age);
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public int setAge(int age) {
        if (age >= 0 && age <= 50) {
            this.age = age;
        }
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight());
    }

    public boolean run(int length) {
        if (length > 0){
            System.out.printf("%s пробежал %dм\n", getName(), length);
            return true;
        }
        System.out.println("Ошибка ввода!!! Дистанция бега должна быть больше нуля!");
        return false;
    }

    public boolean swim(int length) {
        if (length > 0){
            System.out.printf("%s проплыл %dм\n", getName(), length);
            return true;
        }
        System.out.println("Ошибка ввода!!! Дистанция плавания должна быть больше нуля!");
        return false;
    }
}

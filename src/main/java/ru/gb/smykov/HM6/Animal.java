package ru.gb.smykov.HM6;

public abstract class Animal {
    private String name;
    private int age;
    private double weight;
    private static int count;
    private final int runLimit;
    private final int swimLimit;
    private int appetite;

    private boolean isFull;

    public Animal(String name, int age, double weight, int runLimit, int swimLimit, int appetite) {
        this.name = name;
        this.age = setAge(age);
        this.weight = weight;
        this.runLimit = runLimit;
        this.swimLimit = swimLimit;
        this.appetite = appetite;
        isFull = false;
        count++;
    }

    public static int getCount() {
        return count;
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

    public boolean isFull() {
        return isFull;
    }

    public void print() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Weight: " + getWeight());
        System.out.println("Full: " + (isFull() ? "сыт" : "голоден"));
    }

    public void run(int length) {
        if (length > 0 && length <= runLimit) {
            System.out.printf("%s пробежал %dм\n", this, length);
        } else if (length < 0) {
            System.out.println("Ошибка ввода!!! Дистанция бега должна быть больше нуля!");
        } else {
            System.out.printf("Ошибка!!! %s не может пробежать более %dм!\n", this, runLimit);
        }
    }

    public void swim(int length) {
        if (length > 0 && length <= swimLimit) {
            System.out.printf("%s проплыл %dм\n", this, length);
        } else if (length < 0) {
            System.out.println("Ошибка ввода!!! Дистанция плавания должна быть больше нуля!");
        } else {
            System.out.printf("Ошибка!!! %s не может проплыть более %dм!", this, swimLimit);
        }
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public int getAppetite() {
        return appetite;
    }

    public void eat(Plate plate) {
        this.isFull = plate.decreaseFood(appetite);
    }
}

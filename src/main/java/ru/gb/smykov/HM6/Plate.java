package ru.gb.smykov.HM6;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "Plate: "+ food;
    }

    public boolean decreaseFood(int n) {
        if (food < n) {
            return false;
        }
        food -= n;
        return true;
    }

    public void addFood(int extraFood) {
        if (extraFood > 0 && extraFood <= Integer.MAX_VALUE){
            food += extraFood;
        } else {
            System.out.println("Ошибка!!! Невозможно добавить отрицательное количесвтво еды!!!");
        }
    }


}

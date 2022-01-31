package ru.job4j.oop;

public class Battery {

    private int load;

    public static void main(String[] args) {

    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public Battery(int load) {
        this.load = load;
    }

    public int getLoad() {
        return load;
    }
}

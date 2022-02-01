package ru.job4j.poly;

public class Train implements Vehicle {

    @Override
    public void move() {
        System.out.println("I'm moving along the rails");
    }
}

package ru.job4j.poly;

public class Bus implements Transport, Vehicle {

    @Override
    public void drive() {
        System.out.println("Bus is driving");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Number of passengers: " + number);
    }

    @Override
    public double refuel(double fuelQuantity) {
        return 15 * fuelQuantity;
    }

    @Override
    public void move() {
        System.out.println("The car is driving on the road");
    }
}

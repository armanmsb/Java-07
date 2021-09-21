package com.company;

public class Car extends Vehicles{

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return ("I am " + this.getBrand() + " and I go zoom zoom zoom!");
    }
}

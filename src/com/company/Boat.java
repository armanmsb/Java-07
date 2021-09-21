package com.company;

public class Boat extends Vehicles{

    public Boat(String brand, int kilometers) {
        super(brand, kilometers);
    }

    @Override
    public String doStuff() {
        return ("I am " + this.getBrand() + " and I go glug glug glug!");
    }
}

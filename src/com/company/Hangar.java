package com.company;

public class Hangar {

    public static void main(String[] args) {

        Car c1 = new Car("Audi", 1000);
        Boat b1 = new Boat("Nimbus", 600);

        System.out.println(c1.doStuff());
        System.out.println(b1.doStuff());
    }
}

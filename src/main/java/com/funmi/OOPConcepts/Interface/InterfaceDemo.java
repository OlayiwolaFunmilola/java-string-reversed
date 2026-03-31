package com.funmi.OOPConcepts.Interface;

public class InterfaceDemo {

    static void main(String[] args) {

        MountainBike mountainBike = new MountainBike(30, 20, 1);

        System.out.println("Gear is : " + mountainBike.getGear());
        System.out.println("Seat height is: " + mountainBike.getSeatHeight());
        System.out.println("Bike speed is: " + mountainBike.getSpeed());

        mountainBike.applyBrake(1);
        System.out.println("Bike speed after applying break is : " + mountainBike.getSpeed());

        mountainBike.speedup(20);
        System.out.println("Bike's new speed after increment is: " + mountainBike.getSpeed());

    }
}

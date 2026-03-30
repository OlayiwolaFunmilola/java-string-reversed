package com.funmi.OOPConcepts.Inheritance;

public class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int starHeight, int starSpeed, int starGear) {

        super(starSpeed, starGear);
        this.seatHeight = starHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }
}

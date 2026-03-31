package com.funmi.OOPConcepts.Interface;

public class MountainBike implements Bicycle {

    private int seatHeight;
    private int gear;
    private  int speed;

    public MountainBike(int startHeight, int startSpeed, int startGear) {
        seatHeight = startHeight;
        speed = startSpeed;
        gear = startGear;

    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public int getGear() {
        return gear;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "MountainBike{" +
                "seatHeight=" + seatHeight +
                ", gear=" + gear +
                ", speed=" + speed +
                '}';
    }

    @Override
    public void applyBrake(int decrement) {

    }

    @Override
    public void speedup(int increment) {

    }
}

package com.funmi.OOPConcepts;

class Bicycle {

    protected int gear;
    protected int speed;

    public Bicycle(int starSpeed, int starGear){
        gear = starGear;
        speed = starSpeed;

    }

    public int getGear() {
        return gear;
    }

    public void setGear(int newValue){
        gear = newValue;

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void applyBreak(int decrement){
        speed -= decrement;

    }
    public void speedUp(int increment){
        speed += increment;
    }
}

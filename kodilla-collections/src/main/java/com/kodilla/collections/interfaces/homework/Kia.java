package com.kodilla.collections.interfaces.homework;

public class Kia implements Car {

    private double speedK;

    public Kia (double speedK) {
        this.speedK = speedK;
    }

    @Override
    public double getSpeed() {
        return speedK;
    }

    public double increaseSpeed() {
        return speedK + 27;
    }

    public double decreaseSpeed() {
        return speedK - 15;
    }
}

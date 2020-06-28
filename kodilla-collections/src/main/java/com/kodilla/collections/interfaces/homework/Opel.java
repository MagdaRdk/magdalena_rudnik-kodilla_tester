package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {

    private double speedO;

    public Opel (double speedO) {
        this.speedO = speedO;
    }

    @Override
    public String toString() {
        return "Opel{" +
                "speedO=" + speedO +
                '}';
    }

    @Override
    public double getSpeed() {
        return speedO;
    }

    public double increaseSpeed() {
        return speedO + 20;
    }

    public double decreaseSpeed() {
        return speedO - 5;
    }
}

package com.kodilla.collections.interfaces.homework;

public class Ford implements Car{

    private double speedF;

    public Ford (double speedF) {
        this.speedF = speedF;
    }

    @Override
    public double getSpeed() {
        return speedF;
    }

    public double increaseSpeed() {
        return speedF + 15;
    }

    public double decreaseSpeed() {
        return speedF - 10;
    }
}

package com.kodilla.inheritance.homework;

public class SpecialOperatingSystem extends OperatingSystem {
    public SpecialOperatingSystem(int year) {
        super(year);
        System.out.println("Special Operating System constructor");
    }
    public void turnOn() {
        System.out.println("Special Operating System turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Special Operating System turned off");
    }

    public void displayYear() {
        System.out.println("Advanced Operating System turned on" + getYear());
    }
}

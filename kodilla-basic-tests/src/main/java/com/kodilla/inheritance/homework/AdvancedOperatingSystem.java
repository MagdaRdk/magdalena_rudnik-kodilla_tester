package com.kodilla.inheritance.homework;

public class AdvancedOperatingSystem extends SpecialOperatingSystem {
    public AdvancedOperatingSystem(int year) {
        super(year);
        System.out.println("Advanced Operating System constructor");
    }

    @Override
    public void turnOn() {
        System.out.println("Advanced Operating System turned on");
    }
    public void turnOff() {
        System.out.println("Advanced Operating System turned off");
    }
}

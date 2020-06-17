package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {
        this.year = year;
        System.out.println("OperatingSystem constructor");
    }

    public void turnOn() {
        System.out.println("Operating System turned on");
    }

    public void turnOff() {
        System.out.println("Operating System turned off");
    }

    public int getYear() {
        return year;
    }

    public void displayYearOfSystem() {
        System.out.println("Special Operating System turned on" + year);
    }
}
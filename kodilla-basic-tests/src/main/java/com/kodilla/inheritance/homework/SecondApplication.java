package com.kodilla.inheritance.homework;

public class SecondApplication {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2018);
        operatingSystem.turnOn();

        SpecialOperatingSystem specialOperatingSystem = new SpecialOperatingSystem(2019);
        specialOperatingSystem.displayYearOfSystem();

        AdvancedOperatingSystem advancedOperatingSystem = new AdvancedOperatingSystem( 2020);
        advancedOperatingSystem.displayYear();

    }
}

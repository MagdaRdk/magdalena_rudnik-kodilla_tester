package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn() {
        if (hasHeadlightsTurnedOn() != true)
        return false;
        else
            return true;
    }

    @Override
    public String getCarType() {
        return "Cabrio";
    }
}

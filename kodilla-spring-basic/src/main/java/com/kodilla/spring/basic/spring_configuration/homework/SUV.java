package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    //TODO Pls move to Car as default method
    @Override
    public boolean hasHeadlightsTurnedOn() {
        if (hasHeadlightsTurnedOn() != true)//TODO: Method calls itself :)
            return false;
        else
            return true;

        /*
        TODO: Pls try
        LocalTime time = LocalTime.now();
        return time.isAfter(LocalTime.of(20, 0)) || time.isBefore(LocalTime.of(6, 0));
        * */
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}

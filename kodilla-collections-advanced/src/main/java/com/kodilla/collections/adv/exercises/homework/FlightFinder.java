package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlightFinder {
    Map<Flight, FlightRepository> flightFinder = new HashMap<>();

    public List<Flight> findFlightsFrom(String departure) {
        List<Flight> flights = new ArrayList<>();
        for (Flight f : FlightRepository.getFlightsTable()) {
            if (f.getDeparture().equals(departure)) flights.add(f);
        }
        return flights;
    }

    public List<Flight> findFlightsTo(String arrival) {
        List<Flight> flights1 = new ArrayList<>();
        for (Flight fl: FlightRepository.getFlightsTable()) {
            if (fl.getArrival().equals(arrival)) flights1.add(fl);
        }
        return flights1;
    }
}


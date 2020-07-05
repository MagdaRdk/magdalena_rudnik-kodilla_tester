package com.kodilla.collections.adv.exercises.homework;

import java.util.*;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flightTable = new ArrayList<>();

        flightTable.add(new Flight("Berlin", "Tokyo"));
        flightTable.add(new Flight("Paris", "Berlin"));
        flightTable.add(new Flight("Warsaw", "Paris"));
        flightTable.add(new Flight("Madrid", "Berlin"));
        flightTable.add(new Flight("Berlin", "Warsaw"));
        flightTable.add(new Flight("Paris", "Madrid"));
        flightTable.add(new Flight("Porto", "Warsaw"));
        flightTable.add(new Flight("Madrid", "Porto"));
        flightTable.add(new Flight("Warsaw", "Madrid"));

        return flightTable;
    }
}

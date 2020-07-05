package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom() {
        // given
        FlightFinder flightFinder = new FlightFinder();

        // when
        List<Flight> flightsW = flightFinder.findFlightsFrom("Warsaw");
        // then
        assertEquals(2, flightsW.size());
        for (Flight f : flightsW) {
            assertEquals("Warsaw", f.getDeparture());

        }

    }

    @Test
    public void testFindFlightsTo() {
        //given
        FlightFinder flightFinder = new FlightFinder();

        // when

        // then
        fail("not implemented");
    }

}
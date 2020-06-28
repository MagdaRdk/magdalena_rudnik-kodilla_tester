package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Butterfly", 15,25, true));
        stamps.add(new Stamp("Bee", 17,22, true));
        stamps.add(new Stamp("Horse", 20,29, false));
        stamps.add(new Stamp("Train", 22,30, false));
        stamps.add(new Stamp("Butterfly", 15,25, true));
        stamps.add(new Stamp("Horse", 20,29, false));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}

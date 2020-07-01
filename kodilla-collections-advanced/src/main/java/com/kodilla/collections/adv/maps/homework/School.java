package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Double> school = new ArrayList<>();

    public School(double...school) {
        for(double schools : school)
            this.school.add(schools);
    }

    public double getSum() {
        double sum = 0.0;
        for (double schools : school)
            sum += schools;
        return sum;
    }


}

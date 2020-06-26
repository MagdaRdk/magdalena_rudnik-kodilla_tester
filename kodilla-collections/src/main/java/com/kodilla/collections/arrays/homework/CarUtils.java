package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("______________________");
        System.out.println("Car kind: " + getCarName(car));
        System.out.println("Car increase " + car.increaseSpeed());
        System.out.println("Car decrease " + car.decreaseSpeed());
    }

    private static String getCarName(Car car) {
        if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Kia)
            return "Kia";
        else
            return "Unknown car name";
    }
}

package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        Opel opel = new Opel(75.0);
        cars.add(opel);
        cars.add(new Opel(75.0));
        cars.add(new Kia(82.0));
        cars.add(new Ford(55.0));

        for (Car car : cars)
            System.out.println(car);

      cars.remove(3);
      cars.remove(opel);

        for (Car car : cars)
            System.out.println(car);

        System.out.println(cars.size());

            }
        }



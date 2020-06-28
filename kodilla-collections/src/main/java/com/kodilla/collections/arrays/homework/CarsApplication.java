package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Kia;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        /*TODO: Review kdrzazga Random size 1 to 15 is needed, as excercise says:
         *  tablica o losowym rozmiarze od 1 do 15 samochodów.*/
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        double a = random.nextDouble() * 100 + 1;
        double b = random.nextDouble() * 100 + 1;/*TODO Review kdrzazga: Redunant variables. Please leave only variable a and use it in every case*/
        double c = random.nextDouble() * 100 + 1;
        if (drawnCarKind == 0)
            return new Opel(a);
        else if (drawnCarKind == 1)
            return new Ford(b);
        else
            return new Kia(c);
    }
}

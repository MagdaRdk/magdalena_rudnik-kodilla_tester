package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(70);
        doRace(ford);

        Opel opel = new Opel(60);
        doRace(opel);

        Kia kia = new Kia(80);
        doRace(kia);
    }

    private static void doRace(Car car) {
        System.out.println(car.increaseSpeed());
        System.out.println(car.decreaseSpeed());
        System.out.println(car.getSpeed());

    }
}

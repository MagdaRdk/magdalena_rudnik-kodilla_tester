package com.kodilla.abstracts.homework;

public class Trapeze extends Shape{
    public Trapeze() {
        super(11);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface Area is 108");
    }

    @Override
    public void circuit() {
        System.out.println("Circuit is 105");
    }
}

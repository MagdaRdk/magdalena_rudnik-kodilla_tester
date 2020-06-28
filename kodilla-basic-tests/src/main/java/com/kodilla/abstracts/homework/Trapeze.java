package com.kodilla.abstracts.homework;

public class Trapeze extends Shape{
    /*TODO Review: pls use bases here (PL: podstawa)
    *  topBase and bottomBase */


    public Trapeze(int sideHeight) {
        super(sideHeight);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface Area is " + 0.5* getSideHeight() * getSideHeight());
    }

    @Override
    public void circuit() {
        System.out.println("Circuit is " + 4 * getSideHeight());
    }
}

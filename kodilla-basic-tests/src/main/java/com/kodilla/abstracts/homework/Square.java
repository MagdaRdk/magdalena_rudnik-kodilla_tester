package com.kodilla.abstracts.homework;

public class Square extends Shape{

    public Square(int sideHeight) {
        super(sideHeight);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface Area is " + getSideHeight()*getSideHeight());
    }

    @Override
    public void circuit() {
        System.out.println("Circuit is " + 4 * getSideHeight());

    }
}

package com.kodilla.abstracts.homework;

public class Circle extends Shape {


    public Circle(int sideHeight) {
        super(sideHeight);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface Area is " + Math.PI * getSideHeight()*getSideHeight());
    }

    @Override
    public void circuit() {
        System.out.println("Circuit is " + 2* Math.PI *getSideHeight());
    }
}

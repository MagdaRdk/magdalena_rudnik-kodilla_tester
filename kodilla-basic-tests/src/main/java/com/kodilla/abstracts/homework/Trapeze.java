package com.kodilla.abstracts.homework;

public class Trapeze extends Shape {

    int topBase;
    int bottomBase;

    public Trapeze(int sideHeight, int topBase, int bottomBase) {
        super(sideHeight);
        this.topBase = topBase;
        this.bottomBase = bottomBase;
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface Area is " + 0.5 * getSideHeight() * (topBase + bottomBase));
    }

    @Override
    public void circuit() {
        double x = Math.abs(topBase - bottomBase) / 2.0;
        double side = Math.sqrt(getSideHeight() * getSideHeight() + x * x);
        System.out.println("Circuit is " + topBase + bottomBase + 2 * side);
    }

}


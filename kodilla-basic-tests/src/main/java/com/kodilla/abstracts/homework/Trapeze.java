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
        System.out.println("Circuit is " + getSideHeight() + topBase + bottomBase + Math.sqrt((getSideHeight()*getSideHeight()) + ((bottomBase-topBase)*(bottomBase-topBase))));
        }

}


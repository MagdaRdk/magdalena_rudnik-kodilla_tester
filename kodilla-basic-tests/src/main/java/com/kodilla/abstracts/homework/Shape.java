package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int sideHeight;

    public Shape (int sideHeight) {

        this.sideHeight = sideHeight;
    }

        public int getSideHeight() {

        return sideHeight;
        }

    public abstract void surfaceArea ();

    public abstract void circuit ();

}

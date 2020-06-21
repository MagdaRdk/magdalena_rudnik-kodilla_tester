package com.kodilla.abstracts.homework;

public class Square extends Shape{
    public Square() {
        super(5);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface Area is 50");
    }/*TODO Review kdrzazga - Pls compute real surface*/

    @Override
    public void circuit() {
        System.out.println("Circuit is 45");/*TODO Review kdrzazga - Pls compute real circuit*/

    }
}

package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public Circle() {
        super(7);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface Area is 65");
    }/*TODO Review kdrzazga - Pls compute real surface*/

    @Override
    public void circuit() {
        System.out.println("Circuit is 61");
    }/*TODO Review kdrzazga - Pls compute real circuit*/
}

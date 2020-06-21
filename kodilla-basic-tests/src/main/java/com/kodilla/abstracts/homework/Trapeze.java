package com.kodilla.abstracts.homework;

public class Trapeze extends Shape{
    public Trapeze() {
        super(11);
    }

    @Override
    public void surfaceArea() {
        System.out.println("Surface Area is 108");
    }/*TODO Review kdrzazga - Pls compute real surface*/

    @Override
    public void circuit() {
        System.out.println("Circuit is 105");
    }/*TODO Review kdrzazga - Pls compute real circuit*/
}

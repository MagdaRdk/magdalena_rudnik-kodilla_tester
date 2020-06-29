package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(11);
        square.circuit();
        square.surfaceArea();

        Circle circle = new Circle(7);
        circle.circuit();
        circle.surfaceArea();

        Trapeze trapeze = new Trapeze(11, 15, 20);
        trapeze.circuit();
        trapeze.surfaceArea();
    }
}

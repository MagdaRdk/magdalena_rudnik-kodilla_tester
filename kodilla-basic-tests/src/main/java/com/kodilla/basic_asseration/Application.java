package com.kodilla.basic_asseration;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;

        int sumResult = calculator.sum(a,b);
        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a,b);
        boolean subtractCorrect = ResultChecker.assertEquals(-3, subtractResult);
        if (subtractCorrect) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        }else {
            System.out.println("Metoda subtract nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int powResult = calculator.pow(a);
        boolean powCorrect = ResultChecker.assertEquals(25,powResult);
        if (powCorrect) {
            System.out.println("Metoda pow działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczby " + a);
        }
    }
}

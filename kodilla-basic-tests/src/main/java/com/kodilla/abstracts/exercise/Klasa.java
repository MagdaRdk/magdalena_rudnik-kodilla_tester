package com.kodilla.abstracts.exercise;

public class Klasa {
    protected int a;
    private final int B = 20;
    private static double PI=3.14;

    public static void main(String[] args) {
        Klasa klasa = new Klasa(); /*konstruktor domyślny (bez parametru)*/
        Klasa klasa1 = new Klasa();
        Klasa klasa2 = new Klasa();

        klasa.a = 5;
        System.out.println(klasa1.a);
        //klasa2.B = 15;
        System.out.println(Klasa.PI);

    }
}

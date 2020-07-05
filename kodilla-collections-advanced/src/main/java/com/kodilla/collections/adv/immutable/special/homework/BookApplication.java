package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        Book book = bookManager.createBook("Chłopi", "Reymont");
        Book book1 = bookManager.createBook("Krzyżacy", "Sienkiewicz");
        Book book2 = bookManager.createBook("Krzyżacy", "Sienkiewicz");

        System.out.println(book == book1);
        System.out.println(book.equals(book1));
        System.out.println(book1.equals(book2));
        System.out.println(book1 == book2);

    }
}
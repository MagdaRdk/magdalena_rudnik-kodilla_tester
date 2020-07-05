package com.kodilla.collections.adv.immutable.special.homework;


import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> alreadyCreated = new ArrayList<>();


    public Book createBook(String title, String author) {

      Book b = new Book(title, author) ;
      if (alreadyCreated.contains(b))
          System.out.println("Book already in list");
      else
          alreadyCreated.add(b);
      return b;
    }

}



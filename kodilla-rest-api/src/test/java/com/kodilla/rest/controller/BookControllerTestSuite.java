package com.kodilla.rest.controller;

import com.kodilla.rest.domain.BookDto;
import com.kodilla.rest.service.BookService;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


class BookControllerTestSuite {

    @Test
    public void shouldFetchBooks() {
        //Given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        List<BookDto> bookList = new ArrayList<>();
        bookList.add(new BookDto("Title 1", "Author 1"));
        bookList.add(new BookDto("Title 2", "Author 2"));
        Mockito.when(bookServiceMock.getBooks()).thenReturn(bookList);
        //When
        List<BookDto> result = bookController.getBooks();
        //Then
        assertThat(result).hasSize(2);
    }

    @Test
    public void shouldAddBookCorrect() {
        //Given
        BookService bookServiceMock = Mockito.mock(BookService.class);
        BookController bookController = new BookController(bookServiceMock);
        BookDto book = new BookDto("Lord of the ring", "J.R.R. Tolkien");
        Mockito.when(bookServiceMock.addBook()).thenReturn(); //podpowiesz jaki argument tutaj wstawić? Czy cały test jest napisany niepoprawnie?
        //When
        BookDto addBook = bookController.addBook(); //tu też nie wiem co wpisać :)
        //Then
        assertThat(addBook);

    }

}
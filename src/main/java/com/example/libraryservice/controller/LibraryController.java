package com.example.libraryservice.controller;

import com.example.libraryservice.api.LibraryApi;
import com.example.plugins.libraryservice.models.Book;
import org.apache.tomcat.jni.Library;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LibraryController implements LibraryApi {

    @Override
    public ResponseEntity<List<Book>> getAllBooksInLibrary() {
        List<Book> books = new ArrayList<>();

        Book book = new Book();
        book.setName("Harry Potter and the order of the phoenix");
        book.setBookAuthor("J.K Rowling");

        Book book2 = new Book();
        book2.setName("Harry Potter and the deadly hallows");
        book2.setBookAuthor("J.K Rowling");

        books.add(book);
        books.add(book2);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

}

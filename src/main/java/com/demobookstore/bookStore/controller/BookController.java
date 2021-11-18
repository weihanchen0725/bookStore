package com.demobookstore.bookStore.controller;


import com.demobookstore.bookStore.dto.BookDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/v1/books")
public class BookController {

    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        List<BookDto> books = new ArrayList<>();

        BookDto book = BookDto.builder()
                .title("My First Book Title")
                .build();

        BookDto secondBook = BookDto.builder()
                .title("My Second Book Title")
                .build();

        books.add(book);
        books.add(secondBook);
        return ResponseEntity.ok(books);
    }

}

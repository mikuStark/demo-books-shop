package com.example.demo.spring.data.controller;

import com.example.demo.spring.data.model.Book;
import com.example.demo.spring.data.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@RestController
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/authors")
    public List<Book> getAuthors() {
        return bookService.getBooks();
    }

    @GetMapping("/author/{id}")
    public Book getAuthors(@PathVariable Long id) {
        return bookService.getBook(id);
    }
}

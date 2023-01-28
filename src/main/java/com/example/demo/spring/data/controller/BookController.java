package com.example.demo.spring.data.controller;

import com.example.demo.spring.data.model.Book;
import com.example.demo.spring.data.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class BookController {

    private final BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return bookService.getBooks();
    }

    @GetMapping("/book/{id}")
    public Book getBook(@PathVariable Long id) {
        return bookService.getBook(id);
    }
}

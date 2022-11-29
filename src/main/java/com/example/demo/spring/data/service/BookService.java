package com.example.demo.spring.data.service;

import com.example.demo.spring.data.model.Book;

import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
public interface BookService {

    List<Book> getBooks();

    Book getBook(Long id);
}

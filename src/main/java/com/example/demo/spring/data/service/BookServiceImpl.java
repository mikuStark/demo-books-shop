package com.example.demo.spring.data.service;

import com.example.demo.spring.data.model.Book;
import com.example.demo.spring.data.repository.BooksRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {

    private final BooksRepo booksRepo;

    @Override
    public List<Book> getBooks() {
        return booksRepo.findAll();
    }

    @Override
    public Book getBook(Long id) {
        return booksRepo.findById(id).orElse(null);
    }
}

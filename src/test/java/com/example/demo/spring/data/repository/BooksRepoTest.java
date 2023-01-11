package com.example.demo.spring.data.repository;

import com.example.demo.spring.data.ApplicationTests;
import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.model.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
public class BooksRepoTest extends ApplicationTests {

    @Autowired
    BooksRepo booksRepo;

    @Test
    public void findByTitleAndAuthorsIn() {
        Author authorOne = new Author();
        authorOne.setFirstName("First");
        authorOne.setLastName("Last");

        Author authorTwo = new Author();
        authorTwo.setFirstName("First2");
        authorTwo.setLastName("Last2");

        Set<Author> authors = new HashSet<>();
        authors.add(authorOne);
        authors.add(authorTwo);

        Book book = new Book();
        book.setAuthors(authors);
        book.setTitle("title");

        booksRepo.save(book);
        assertNotNull(booksRepo.findAll());

        Book bookInDB = booksRepo.findByTitleAndAuthorsIn("title", authors);
        assertNotNull(bookInDB);

    }
}

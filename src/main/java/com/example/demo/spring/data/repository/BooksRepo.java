package com.example.demo.spring.data.repository;

import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Repository
public interface BooksRepo extends JpaRepository<Book, Long> {

    Book findByTitleAndAuthorsIn(String title, List<Author> authors);
}

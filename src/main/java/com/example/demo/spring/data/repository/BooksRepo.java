package com.example.demo.spring.data.repository;

import com.example.demo.spring.data.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Repository
public interface BooksRepo extends JpaRepository<Book, Long> {
}

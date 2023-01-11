package com.example.demo.spring.data.repository;

import com.example.demo.spring.data.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Repository
public interface AuthorRepo extends JpaRepository<Author, Long> {

    Author findByFirstNameAndLastName(String firstName, String lastName);
}

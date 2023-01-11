package com.example.demo.spring.data.service;

import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.model.request.CreateAuthorRequest;

import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
public interface AuthorService {

    List<Author> getAuthors();

    Author getAuthor(Long id);

    void createAuthor(CreateAuthorRequest request);
}

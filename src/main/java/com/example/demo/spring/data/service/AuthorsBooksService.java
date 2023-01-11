package com.example.demo.spring.data.service;

import com.example.demo.spring.data.model.request.CreateBookRequest;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
public interface AuthorsBooksService {

    void createBookWithAuthors(CreateBookRequest request);
}

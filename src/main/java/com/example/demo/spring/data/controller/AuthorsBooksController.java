package com.example.demo.spring.data.controller;

import com.example.demo.spring.data.model.request.CreateBookRequest;
import com.example.demo.spring.data.service.AuthorsBooksService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class AuthorsBooksController {

    private final AuthorsBooksService authorsBooksService;

    @PostMapping("/create-book")
    public void createBook(@RequestBody CreateBookRequest request) {
        authorsBooksService.createBookWithAuthors(request);
    }
}

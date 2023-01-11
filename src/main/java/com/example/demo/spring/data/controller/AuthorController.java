package com.example.demo.spring.data.controller;

import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.model.request.CreateAuthorRequest;
import com.example.demo.spring.data.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@RestController
@RequiredArgsConstructor
public class AuthorController {

    private final AuthorService authorService;

    @GetMapping("/authors")
    public List<Author> getAuthors() {
        return authorService.getAuthors();
    }

    @GetMapping("/author/{id}")
    public Author getAuthors(@PathVariable Long id) {
        return authorService.getAuthor(id);
    }

    @PostMapping("/create-author")
    public void createAuthor(@RequestBody CreateAuthorRequest request) {
        authorService.createAuthor(request);
    }
}

package com.example.demo.spring.data.service;

import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.repository.AuthorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepo authorRepository;

    @Override
    @Transactional
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthor(Long id) {
        return authorRepository.findById(id).orElse(null);
    }
}

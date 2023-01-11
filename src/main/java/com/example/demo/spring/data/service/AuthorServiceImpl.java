package com.example.demo.spring.data.service;

import com.example.demo.spring.data.exception.AuthorExistException;
import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.model.request.CreateAuthorRequest;
import com.example.demo.spring.data.repository.AuthorRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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
    public List<Author> getAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Author getAuthor(Long id) {
        return authorRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void createAuthor(CreateAuthorRequest request) {
        Optional<Author> authorExist = Optional.ofNullable(
                authorRepository.findByFirstNameAndLastName(request.getFirstName(), request.getLastName()));
        if (authorExist.isPresent()) throw new AuthorExistException();
        Author author = new Author(request.getFirstName(), request.getLastName(), request.getMiddleName());
        authorRepository.save(author);
    }
}

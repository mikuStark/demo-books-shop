package com.example.demo.spring.data.service;

import com.example.demo.spring.data.exception.AuthorNotExistException;
import com.example.demo.spring.data.exception.BookExistException;
import com.example.demo.spring.data.mapper.BookMapper;
import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.model.Book;
import com.example.demo.spring.data.model.request.CreateAuthorRequest;
import com.example.demo.spring.data.model.request.CreateBookRequest;
import com.example.demo.spring.data.repository.AuthorRepo;
import com.example.demo.spring.data.repository.BooksRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Service
@RequiredArgsConstructor
public class AuthorsBooksServiceImpl implements AuthorsBooksService {

    private final BooksRepo booksRepo;
    private final AuthorRepo authorRepo;
    private final BookMapper mapper;

    @Override
    @Transactional
    public void createBookWithAuthors(CreateBookRequest request) {
        Set<Author> authors = checkAndGetAuthors(request.getAuthorsNames());
        Optional<Book> optionalBook = Optional.ofNullable(
                booksRepo.findByTitleAndAuthorsIn(request.getTitle(), authors));
        if (optionalBook.isPresent()) throw new BookExistException();
        Book book = mapper.mapCreateBookRequestToBook(request);
        book.setAuthors(authors);
        booksRepo.save(book);
    }

    private Set<Author> checkAndGetAuthors(List<CreateAuthorRequest> authors) {
        Set<Author> authorList = new HashSet<>();
        authors.forEach(author -> {
            Optional<Author> authorExist = Optional.ofNullable(
                    authorRepo.findByFirstNameAndLastName(author.getFirstName(), author.getLastName()));
            if (authorExist.isEmpty()) throw new AuthorNotExistException();
            authorList.add(authorExist.get());
        });
        return authorList;
    }
}

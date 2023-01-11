package com.example.demo.spring.data.repository;

import com.example.demo.spring.data.ApplicationTests;
import com.example.demo.spring.data.model.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
public class AuthorRepoTest extends ApplicationTests {

    @Autowired
    AuthorRepo authorRepo;

    @Test
    public void findByFirstNameAndLastName() {
        Author author = new Author();
        author.setFirstName("First");
        author.setLastName("Last");
        authorRepo.save(author);
        assertNotNull(authorRepo.findAll());

        Author authorInDB = authorRepo.findByFirstNameAndLastName("First", "Last");
        assertNotNull(authorInDB);
        assertThat(authorInDB.getFirstName()).isEqualTo(author.getFirstName());
    }

}

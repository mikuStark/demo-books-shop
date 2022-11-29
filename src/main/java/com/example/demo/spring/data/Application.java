package com.example.demo.spring.data;

import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.model.Book;
import com.example.demo.spring.data.repository.AuthorRepo;
import com.example.demo.spring.data.repository.BooksRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//	@Bean
//	public CommandLineRunner demo(BooksRepo booksRepo, AuthorRepo authorRepo) {
//		return (args) -> {
//			var book = new Book("Элантрис");
//			var author = new Author("Брендон", "Сандерсон", null);
//			book.getAuthors().add(author);
//			author.getBooks().add(book);
//			booksRepo.save(book);
//			authorRepo.save(author);
//		};
//	}

}

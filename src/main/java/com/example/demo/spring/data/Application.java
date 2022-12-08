package com.example.demo.spring.data;

import com.example.demo.spring.data.model.Author;
import com.example.demo.spring.data.model.Book;
import com.example.demo.spring.data.model.PublishingHouse;
import com.example.demo.spring.data.model.PublishingHouseName;
import com.example.demo.spring.data.repository.AuthorRepo;
import com.example.demo.spring.data.repository.BooksRepo;
import com.example.demo.spring.data.repository.PublishingHouseRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//	@Bean
//	public CommandLineRunner demo(BooksRepo booksRepo, AuthorRepo authorRepo, PublishingHouseRepo publishingHouseRepo) {
//		return (args) -> {
//			var book = new Book("Элантрис", PublishingHouseName.ABC, 100, 100, new Date());
//			var author = new Author("Брендон", "Сандерсон", null);
//			var publishingHouse = new PublishingHouse(PublishingHouseName.ABC, "495111222");
//
//			book.getAuthors().add(author);
//			author.getBooks().add(book);
//			booksRepo.save(book);
//			authorRepo.save(author);
//			publishingHouseRepo.save(publishingHouse);
//			System.out.println(publishingHouseRepo.findPublishingHouseByName(PublishingHouseName.ABC));
//		};
//	}

}

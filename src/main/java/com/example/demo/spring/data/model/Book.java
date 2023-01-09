package com.example.demo.spring.data.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Getter
@Setter
@Entity
@Table(name = "book")
@NoArgsConstructor
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private PublishingHouseName publishingHouseName;

    private Integer price;

    private Integer pages;

    private Date dateOfPublishing;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "authors_books",
            joinColumns = @JoinColumn(name = "author_id"),
            inverseJoinColumns = @JoinColumn(name = "book_id")
    )
    @JsonIgnoreProperties("books")
    //предположим, что часто встречается, что одну книгу могли написать несколько авторов
    Set<Author> authors = new HashSet<>();

    public Book(String title, PublishingHouseName publishingHouseName, Integer price, Integer pages, Date dateOfPublishing) {
        this.title = title;
        this.publishingHouseName = publishingHouseName;
        this.price = price;
        this.pages = pages;
        this.dateOfPublishing = dateOfPublishing;
    }
}

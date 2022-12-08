package com.example.demo.spring.data.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Getter
@Setter
@Entity
@Table(name = "publishing_house")
@NoArgsConstructor
public class PublishingHouse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "publishing_house_id")
    private Long id;

    private PublishingHouseName name;

    private String phoneNumber;

    public PublishingHouse(PublishingHouseName name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

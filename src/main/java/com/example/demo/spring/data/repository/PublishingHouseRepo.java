package com.example.demo.spring.data.repository;

import com.example.demo.spring.data.model.PublishingHouse;
import com.example.demo.spring.data.model.PublishingHouseName;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
public interface PublishingHouseRepo extends JpaRepository<PublishingHouse, Long> {

    PublishingHouse findPublishingHouseByName(PublishingHouseName name);
}

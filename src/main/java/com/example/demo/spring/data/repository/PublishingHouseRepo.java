package com.example.demo.spring.data.repository;

import com.example.demo.spring.data.model.PublishingHouse;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
public interface PublishingHouseRepo extends JpaRepository<PublishingHouse, Long> {
}

package com.example.demo.spring.data.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Getter
@AllArgsConstructor
public enum PublishingHouseName {

    AST("АСТ"),
    ABC("Азбука"),
    ONYX("ОНИКС");

    private String name;
}

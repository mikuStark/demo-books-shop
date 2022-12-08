package com.example.demo.spring.data.model.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Data
public class CreateAuthorRequest {

    @NotBlank
    private String firstName;

    @NotBlank
    private String lastName;

    private String middleName;
}

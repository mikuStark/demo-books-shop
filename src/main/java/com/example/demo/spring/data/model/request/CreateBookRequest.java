package com.example.demo.spring.data.model.request;

import com.example.demo.spring.data.model.PublishingHouseName;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.util.Date;
import java.util.List;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Data
public class CreateBookRequest {

    @NotBlank
    private String title;

    @NotBlank
    private List<CreateAuthorRequest> authorsNames;

    @NotBlank
    private PublishingHouseName publishingHouseName;

    @NotBlank
    private Integer price;

    @NotBlank
    private Integer pages;

    @NotBlank
    private Date dateOfPublishing;
}

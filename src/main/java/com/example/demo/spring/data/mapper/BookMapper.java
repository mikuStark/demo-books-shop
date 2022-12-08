package com.example.demo.spring.data.mapper;

import com.example.demo.spring.data.model.Book;
import com.example.demo.spring.data.model.request.CreateBookRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public abstract class BookMapper {

    public abstract Book mapCreateBookRequestToBook(CreateBookRequest request);
}

package com.example.demo.spring.data.model.request;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@Getter
@Setter
@NoArgsConstructor
public class AuthenticationRequest {

    private String email;
    private String password;
}

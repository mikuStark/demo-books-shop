package com.example.demo.spring.data.controller;

import com.example.demo.spring.data.config.JwtUtils;
import com.example.demo.spring.data.dao.UserDao;
import com.example.demo.spring.data.model.request.AuthenticationRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * mkarbainova
 *
 * @author Mariya Karbainova
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/auth")
public class AuthenticationController {

    private final AuthenticationManager authenticationManager;
    private final UserDao userDao;
    private final JwtUtils utils;

    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody AuthenticationRequest request) {

        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(request.getEmail(), request.getPassword())
        );
        final UserDetails user = userDao.findUserByEmail(request.getEmail());
        return user != null
            ? ResponseEntity.ok(utils.generateToken(user))
            : ResponseEntity.status(400).body("Some error has occurred");

    }
}

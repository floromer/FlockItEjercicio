package com.flockit.ejercicio.controllers;

import com.flockit.ejercicio.exceptions.UserLoginException;
import com.flockit.ejercicio.models.requests.LoginRequest;
import com.flockit.ejercicio.services.LoginServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class LoginController {

    Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginServiceImpl loginService;

    @PostMapping("/api/auth/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest authenticationRequest) {
        try {
            return ResponseEntity.ok(loginService.processRequest(authenticationRequest.username, authenticationRequest.password));
        } catch (UserLoginException e) {
            logger.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }
    
}

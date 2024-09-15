package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RestController
public class Controller {
    @GetMapping("/")
    public ResponseEntity<String> tst(){
        System.out.println("Hello from test server");
        return new ResponseEntity<String>("Nacho cheese", HttpStatus.valueOf(200));
    }
}

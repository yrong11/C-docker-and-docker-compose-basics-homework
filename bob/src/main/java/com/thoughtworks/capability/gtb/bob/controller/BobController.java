package com.thoughtworks.capability.gtb.bob.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class BobController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello from Bob!";
    }
}

package com.example.userservice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Value("${greeting.message:Hello from User Service!}")
    private String greeting;

    @GetMapping("/{id}")
    public String getUser(@PathVariable String id) {
        return greeting + " (User ID: " + id + ")";
    }
}
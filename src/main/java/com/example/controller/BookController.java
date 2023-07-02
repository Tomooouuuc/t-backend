package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @GetMapping("/book")
    public String test(){
        System.out.println("backend");
        return "t-backend";
    }
}

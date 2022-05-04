package com.gabrielmazzorana.bookstaremanager.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")   //v1: é a primeira versão da api
public class BookController {

    @GetMapping
    public String hello(){
        return "Hello Bookstore Manager";
    }
}

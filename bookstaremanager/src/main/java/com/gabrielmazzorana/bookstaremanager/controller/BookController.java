package com.gabrielmazzorana.bookstaremanager.controller;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/books")   //v1: é a primeira versão da api
public class BookController {

    @ApiOperation(value = "Return and example hello world")  //anotação para o swagger fazer a documentacao
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Sucess method return")
    })
    @GetMapping
    public String hello(){
        return "Hello Bookstore Manager";
    }
}

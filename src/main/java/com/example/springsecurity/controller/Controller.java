package com.example.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class Controller {

    @GetMapping("home")
    public String greet(HttpServletRequest request){
        return "Hello world" + request.getSession().getId();
    }
}

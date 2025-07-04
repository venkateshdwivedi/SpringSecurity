package com.example.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springsecurity.model.User;
import com.example.springsecurity.service.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping("register")
    public User register(@RequestBody User user){
      service.saveUser(user);
      return user;
    }
}

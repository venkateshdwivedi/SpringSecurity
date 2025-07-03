package com.example.springsecurity.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springsecurity.model.User;

public interface UserRepo extends JpaRepository<User,Integer>{
    User findByUsername(String username);
}

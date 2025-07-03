package com.example.springsecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.springsecurity.dao.UserRepo;
import com.example.springsecurity.model.User;
import com.example.springsecurity.model.UserPrincipal;

@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = repo.findByUsername(username); // here User is from our model package

        if (user == null) {
            System.out.println("User 404");
            throw new UsernameNotFoundException("User 404");
        }

         return new UserPrincipal(user);
    }

}

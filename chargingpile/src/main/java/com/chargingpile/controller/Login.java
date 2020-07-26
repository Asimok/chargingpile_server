package com.chargingpile.controller;

import com.chargingpile.data.User;
import com.chargingpile.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Login {
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public int login(User user){
        System.out.println(user);
        userService.saveUserInfo(user);
        return 1;
    }
}

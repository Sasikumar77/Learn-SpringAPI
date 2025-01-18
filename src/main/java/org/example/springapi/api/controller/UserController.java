package org.example.springapi.api.controller;

import org.example.springapi.api.model.User;
import org.example.springapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/user")
    public Optional<User> getUser(@RequestParam Integer id) {
       Optional<User> user = userService.getUser(id);
       if (user.isPresent()) {
           return user;
       } else {
           return null;
       }
    }

}

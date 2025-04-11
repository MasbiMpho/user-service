package com.autosyn.user_service.controller;

import com.autosyn.user_service.model.User;
import com.autosyn.user_service.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserRepository repo;

    @PostMapping("/addUser")
    public void addUser(@RequestBody User user) {
        repo.save(user);
    }
}

package com.example.DeveloperCommunityPlatform.controller;

import com.example.DeveloperCommunityPlatform.dto.LoginRequest;
import com.example.DeveloperCommunityPlatform.model.User;
import com.example.DeveloperCommunityPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService userService;


    @GetMapping("/getuser/{id}")
    public User getuser(@PathVariable int id){
        return userService.getUser(id);
    }


    @PostMapping("/users")
    public User adduser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public String authenticateUser(@RequestBody LoginRequest loginRequest){
        return userService.auth(loginRequest);
    }

}

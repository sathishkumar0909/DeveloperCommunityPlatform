package com.example.DeveloperCommunityPlatform.service;

import com.example.DeveloperCommunityPlatform.model.User;
import com.example.DeveloperCommunityPlatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user) {
        return userRepository.save(user); // Saves the user into the database
    }
    public User getUser(int id){return userRepository.findById((long) id).get();}
}

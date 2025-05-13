package com.example.DeveloperCommunityPlatform.controller;
import com.example.DeveloperCommunityPlatform.model.Post;
import com.example.DeveloperCommunityPlatform.model.User;
import com.example.DeveloperCommunityPlatform.service.PostService;
import com.example.DeveloperCommunityPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;




    @GetMapping("/getuser/{id}")
    public User getuser(@PathVariable int id){
        return userService.getUser(id);
    }


    @PostMapping("/users")
    public User adduser(){
       User user=new User();
       user.setName("Sathish");
       user.setEmail("Sathish@gmail.com");
       return userService.saveUser(user);
    }

    @GetMapping("/getpost/{id}")
    public Post getPost(@PathVariable int id){return postService.getPost(id);}

    @PostMapping("/posts")
    public Post createPost(){
        Post post=new Post();
        post.setTitle("First Post");
        post.setContext("First Context");
        post.setAuthor(userService.getUser(1));
        java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2007-09-23 10:10:10.0");
        post.setCreatedAt(timestamp);
        post.setUpdatedAt(timestamp);
        return postService.savePost(post);
    }

    @GetMapping("/getauthorpost/{id}")
    public List<Post> getauthorpost(@PathVariable int id){
        return postService.findByAuthorPost(id);
    }
}

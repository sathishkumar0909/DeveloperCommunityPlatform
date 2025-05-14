package com.example.DeveloperCommunityPlatform.controller;

import com.example.DeveloperCommunityPlatform.model.Post;
import com.example.DeveloperCommunityPlatform.service.PostService;
import com.example.DeveloperCommunityPlatform.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PostController {

    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;

    @GetMapping("/getpost/{id}")
    public Post getPost(@PathVariable int id) {
        return postService.getPost(id);
    }

    @PostMapping("/posts")
    public Post createPost(@RequestBody Post post) {
        return postService.savePost(post);
    }

    @GetMapping("/getauthorpost/{id}")
    public List<Post> getauthorpost(@PathVariable int id) {
        return postService.findByAuthorPost(id);
    }

    @GetMapping("/posts")
    public List<Post> getAllPost(){
        return postService.getAllPost();
    }
}

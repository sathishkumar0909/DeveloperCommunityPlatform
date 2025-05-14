package com.example.DeveloperCommunityPlatform.controller;

import com.example.DeveloperCommunityPlatform.model.Comment;
import com.example.DeveloperCommunityPlatform.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CommentController {

    @Autowired
    public CommentService commentService;

    @PostMapping("/comments")
    public Comment postComment(@RequestBody Comment comment){
        return commentService.saveComment(comment);
    }

    @GetMapping("comments/{id}")
    public List<Comment> getComments(@PathVariable int id){
        return commentService.getCommentById(id);
    }

}

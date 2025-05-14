package com.example.DeveloperCommunityPlatform.service;

import com.example.DeveloperCommunityPlatform.model.Comment;
import com.example.DeveloperCommunityPlatform.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    public Comment saveComment(Comment comment) {
        comment.setAuthor(userService.getUser(comment.getAuthor().getId()));
        comment.setPost(postService.getPost(comment.getPost().getId()));
        return commentRepository.save(comment);
    }

    public List<Comment> getCommentById(int id) {
        return  commentRepository.findByPost_Id(id);
    }
}

package com.example.DeveloperCommunityPlatform.service;

import com.example.DeveloperCommunityPlatform.model.Like;
import com.example.DeveloperCommunityPlatform.repository.LikeRepository;
import com.example.DeveloperCommunityPlatform.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LikeService {
    @Autowired
    private LikeRepository likeRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    public Like postLike(Like like) {
        like.setAuthor(userService.getUser(like.getAuthor().getId()));
        like.setPost(postService.getPost(like.getPost().getId()));
        return likeRepository.save(like);
    }

    public Like deleteLike(int id) {
        Like like=likeRepository.findById(id).get();
        likeRepository.deleteById(id);
        return like;
    }
}

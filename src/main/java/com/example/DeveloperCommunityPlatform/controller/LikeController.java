package com.example.DeveloperCommunityPlatform.controller;

import com.example.DeveloperCommunityPlatform.model.Like;
import com.example.DeveloperCommunityPlatform.service.LikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class LikeController {

    @Autowired
    private LikeService likeService;

    @PostMapping("/likes")
    public Like postLike(@RequestBody Like like){
        return likeService.postLike(like);
    }

    @DeleteMapping("/likes/{pid}")
    public Like deleteLike(@PathVariable int pid){
        return likeService.deleteLike(pid);
    }
}

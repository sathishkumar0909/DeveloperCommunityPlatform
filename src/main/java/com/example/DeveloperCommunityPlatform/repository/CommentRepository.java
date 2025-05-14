package com.example.DeveloperCommunityPlatform.repository;

import com.example.DeveloperCommunityPlatform.model.Comment;
import com.example.DeveloperCommunityPlatform.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment,Integer> {

    List<Comment> findByPost_Id(int postID);
}

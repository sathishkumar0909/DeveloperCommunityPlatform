package com.example.DeveloperCommunityPlatform.repository;

import com.example.DeveloperCommunityPlatform.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {
    List<Post> findByAuthor_Id(int authorId);
}

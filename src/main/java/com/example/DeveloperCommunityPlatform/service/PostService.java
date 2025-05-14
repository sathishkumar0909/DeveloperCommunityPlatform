package com.example.DeveloperCommunityPlatform.service;

import com.example.DeveloperCommunityPlatform.model.Post;
import com.example.DeveloperCommunityPlatform.model.User;
import com.example.DeveloperCommunityPlatform.repository.PostRepository;
import com.example.DeveloperCommunityPlatform.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post){
        int authorId= post.getAuthor().getId();
        User author= userRepository.findById(authorId).get();
        post.setAuthor(author);
        return postRepository.save(post);
    }
    public Post getPost(int id){return postRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Post with ID " + id + " not found"));}

    public List<Post> findByAuthorPost(int authorId){return postRepository.findByAuthor_Id(authorId);}


    public List<Post> getAllPost() {
        return postRepository.findAll();
    }
}

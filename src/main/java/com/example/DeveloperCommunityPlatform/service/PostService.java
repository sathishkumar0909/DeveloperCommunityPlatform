package com.example.DeveloperCommunityPlatform.service;

import com.example.DeveloperCommunityPlatform.model.Post;
import com.example.DeveloperCommunityPlatform.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public Post savePost(Post post){
        return postRepository.save(post);
    }
    public Post getPost(int id){return postRepository.findById((long) id).get();}

    public List<Post> findByAuthorPost(int authorId){return postRepository.findByAuthor_Id(authorId);}


}

package com.example.DeveloperCommunityPlatform.model;

import jakarta.persistence.*;

import java.sql.Timestamp;

@Entity
@Table(name="comments")
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String text;
    @ManyToOne
    @JoinColumn(name = "author_id",nullable = false)
    private User author;
    @ManyToOne
    @JoinColumn(name = "post_id",nullable = false)
    private Post post;
    private Timestamp createdAt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

}

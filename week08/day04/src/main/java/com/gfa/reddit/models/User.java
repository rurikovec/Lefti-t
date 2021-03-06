package com.gfa.reddit.models;

import javax.persistence.*;
import java.util.List;

@Entity

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;
    private String username;
    private String password;

    @OneToMany(mappedBy = "user")
    private List<Post> posts;

    public User(Long userId, String username, String password, List<Post> posts) {
        this.userId = userId;
        this.username = username;

        this.password = password;
        this.posts = posts;
    }

    public User(String username,  String password) {
        this.username = username;

        this.password = password;
        this.posts = null;
    }

    public User() {

    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}

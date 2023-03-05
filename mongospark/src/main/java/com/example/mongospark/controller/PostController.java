package com.example.mongospark.controller;


import com.example.mongospark.model.Post;
import com.example.mongospark.respository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepository postRepository;


    @GetMapping("/allPosts")
    public List<Post> getAllPost() {

        List<Post> allPosts = postRepository.findAll();
        return allPosts;
    }





}

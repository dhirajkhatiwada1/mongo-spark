package com.example.mongospark.respository;

import com.example.mongospark.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepository  extends MongoRepository<Post, String> {
}

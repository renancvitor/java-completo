package com.rcv.workshopmongo.repository;


import com.rcv.workshopmongo.domain.Post;
import com.rcv.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    List<Post> findByTittleContainingIgnoreCase(String text);
}

package com.rcv.workshopmongo.resources;

import com.rcv.workshopmongo.domain.Post;
import com.rcv.workshopmongo.domain.User;
import com.rcv.workshopmongo.dto.UserDTO;
import com.rcv.workshopmongo.services.PostService;
import com.rcv.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/posts")
public class PostResources {

    @Autowired
    private PostService service;

//    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
//    public ResponseEntity<Post> findById(@PathVariable String id) {
//        Post obj = service.findById(id);
//        return ResponseEntity.ok().body(obj);
//    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Post> findById(@PathVariable String id) {
        Post post = service.findById(id);

        return ResponseEntity.ok().body(post);
    }
}

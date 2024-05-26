package com.rcv.workshopmongo.resources;

import com.rcv.workshopmongo.domain.Post;
import com.rcv.workshopmongo.domain.User;
import com.rcv.workshopmongo.dto.UserDTO;
import com.rcv.workshopmongo.resources.util.URL;
import com.rcv.workshopmongo.services.PostService;
import com.rcv.workshopmongo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Locale;
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

    @GetMapping(value = "/tittlesearch")
    public ResponseEntity<List<Post>> findByTittle(@RequestParam(value = "text", defaultValue = "") String text) {
        text = URL.decodeParam(text);
        List<Post> list = service.findByTittle(text);
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/fullsearch")
    public ResponseEntity<List<Post>> fullSearch(@RequestParam(value = "text", defaultValue = "") String text, @RequestParam(value = "minDate", defaultValue = "") String minDate, @RequestParam(value = "maxDate", defaultValue = "") String maxDate) {
        text = URL.decodeParam(text);
        LocalDate min = URL.convertData(minDate, LocalDate.EPOCH);
        LocalDate max = URL.convertData(maxDate, LocalDate.now());

        List<Post> list = service.fullSearch(text, min, max);
        return ResponseEntity.ok().body(list);
    }
}

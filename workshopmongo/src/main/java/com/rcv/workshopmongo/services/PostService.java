package com.rcv.workshopmongo.services;


import com.rcv.workshopmongo.domain.Post;
import com.rcv.workshopmongo.domain.User;
import com.rcv.workshopmongo.dto.UserDTO;
import com.rcv.workshopmongo.repository.PostRepository;
import com.rcv.workshopmongo.repository.UserRepository;
import com.rcv.workshopmongo.services.exception.ObjectNotFoundExcetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
    private PostRepository repo;

    public Post findById(String id) {
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundExcetion("User not found."));
    }

    public List<Post> findByTittle(String text) {
        return repo.findByTittle(text);
    }

    public List<Post> fullSearch(String text, LocalDate minDate, LocalDate maxDate) {
        LocalDateTime midnight = maxDate.atTime(LocalTime.MAX);
        maxDate = midnight.toLocalDate();

        return repo.fullSearch(text, minDate, maxDate);
    }
}

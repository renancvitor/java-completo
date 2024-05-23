package com.rcv.workshopmongo.services;


import com.rcv.workshopmongo.domain.User;
import com.rcv.workshopmongo.repository.UserRepository;
import com.rcv.workshopmongo.services.exception.ObjectNotFoundExcetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll() {
        return repo.findAll();
    }

//    public User findById(String id) {
//        User user = repo.findOne(id);
//        if (user == null) {
//            throw new ObjectNotFoundExcetion("Object not found");
//        }
//        return user;
//    }
    public User findById(String id) {
        return repo.findById(id).orElseThrow(() -> new ObjectNotFoundExcetion("User not found."));
}
}

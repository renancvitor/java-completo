package com.rcv.workshopmongo.services;


import com.rcv.workshopmongo.domain.User;
import com.rcv.workshopmongo.dto.UserDTO;
import com.rcv.workshopmongo.repository.UserRepository;
import com.rcv.workshopmongo.services.exception.ObjectNotFoundExcetion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public User insert(User obj) {
        return repo.insert(obj);
    }

    public void deleteById(String id) {
        findById(id);
        repo.deleteById(id);
    }

//    public User update(User obj) {
//        Optional<User> newObj = repo.findById(obj.getId());
//        updateData(newObj.orElse(null), obj);
//        return Optional.of(repo.saveAll(newObj));
//    }
//
//    private void updateData(User newObj, User obj) {
//        newObj.setName(obj.getName());
//        newObj.setEmail(obj.getEmail());
//    }

    public void update(User obj) {
        Optional<User> optionalUser = repo.findById(obj.getId());

        if (optionalUser.isPresent()) {
            User user = optionalUser.get();

            user.setName(obj.getName());
            user.setEmail(obj.getEmail());

            repo.save(user);
        }

        throw new ObjectNotFoundExcetion("User not found.");
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }
}

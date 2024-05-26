package com.rcv.workshopmongo.repository;


import com.rcv.workshopmongo.domain.Post;
import com.rcv.workshopmongo.domain.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

    @Query("{ 'tittle': { $regex: ?0, $options: 'i' } }")
    List<Post> findByTittle(String text);

    List<Post> findByTittleContainingIgnoreCase(String text);

    @Query("{ $and: [ {date: {$gte: ?1} }, { date: {$lte: ?2} } , { $or: [ { 'tittle': { $regex: ?0, $options: 'i' } }, { 'body': { $regex: ?0, $options: 'i' } }, { 'comments.text': { $regex: ?0, $options: 'i' } }")
    List<Post> fullSearch(String text, LocalDate minDate, LocalDate maxDate);
}

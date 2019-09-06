package com.capgemini.graphqlexample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.graphqlexample.entity.Book;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer> {

}

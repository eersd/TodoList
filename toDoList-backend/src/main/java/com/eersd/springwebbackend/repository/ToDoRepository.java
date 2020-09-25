package com.eersd.springwebbackend.repository;

import com.eersd.springwebbackend.data.ToDo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ToDoRepository extends MongoRepository<ToDo, String> {

}

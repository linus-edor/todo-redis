package com.boot.todo.redis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.boot.todo.redis.model.ToDo;

@Repository
public interface ToDoRepository extends CrudRepository<ToDo, String> {
}
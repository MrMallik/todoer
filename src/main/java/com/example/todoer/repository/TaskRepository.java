package com.example.todoer.repository;

import com.example.todoer.models.Task;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TaskRepository extends MongoRepository<Task, Integer> {
    //void editTask(Task task);
}

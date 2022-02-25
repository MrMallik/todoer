package com.example.todoer.service;

import com.example.todoer.models.Task;
import com.example.todoer.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repository;

    public void editTask(Task task){
        Optional<Task> taskInDB = repository.findById(task.getId());

        if(taskInDB.isPresent()){
            taskInDB.get().setTitle(task.getTitle());
            taskInDB.get().setDescription(task.getDescription());
        }
    }
}

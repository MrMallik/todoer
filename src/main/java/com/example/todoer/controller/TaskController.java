package com.example.todoer.controller;

import com.example.todoer.models.Task;
import com.example.todoer.repository.TaskRepository;
import com.example.todoer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository repository;
    @Autowired
    private TaskService service;

    @PostMapping("/addTask")
    public void addTask(@RequestBody Task task){
        repository.save(task);
    }

    @GetMapping("/getTask/{id}")
    public Task getTask(@PathVariable Integer id){
        return repository.findById(id).get();
    }

    @DeleteMapping("/deleteTask/{id}")
    public void deleteTask(@PathVariable Integer id){
        repository.deleteById(id);
    }


    @GetMapping("/getAllTasks")
    public List<Task> getAllTasks(){
        return repository.findAll();
    }

//    @PostMapping("/editTask/")
//    public void editTask(@RequestBody Task task){
//        service.editTask(task);
//    }
}

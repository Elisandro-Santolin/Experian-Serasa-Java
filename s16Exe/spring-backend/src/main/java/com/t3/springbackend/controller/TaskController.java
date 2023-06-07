package com.t3.springbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.t3.springbackend.service.TaskService;
import com.t3.springbackend.entity.Task;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> allTasks(){
        return taskService.findAllTasks();
    }

    @PostMapping("/tasks/new")
    public Task newTask(@RequestBody Task task){
        return taskService.createTask(task);
    }
}

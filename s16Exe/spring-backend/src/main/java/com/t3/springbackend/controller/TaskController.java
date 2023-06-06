package com.t3.springbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.t3.springbackend.service.TaskService;
import com.t3.springbackend.entity.Task;
import java.util.List;

@RestController
public class TaskController {
    
    @Autowired
    private TaskService taskService;

    @GetMapping("/tasks")
    public List<Task> allTasks(){
        return taskService.findAllTasks();
    }
    
}

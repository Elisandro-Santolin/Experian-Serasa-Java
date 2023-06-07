package com.t3.springbackend.service;

import org.springframework.beans.factory.annotation.Autowired;
import com.t3.springbackend.repository.TaskRepository;
import org.springframework.stereotype.Service;
import com.t3.springbackend.entity.Task;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    
    @Autowired //inicial o objeto
    private TaskRepository taskRepository;

    public Task findTaskById(Long id){
        Optional<Task> optTask = taskRepository.findById(id);
        if(optTask.isPresent()){
            return optTask.get();
        }else{
            return null;
        }
    }
        
    public List<Task> findAllTasks(){
            return taskRepository.findAll();
    }
 
    public Task createTask(Task task){
        return taskRepository.save(task);
    }
}

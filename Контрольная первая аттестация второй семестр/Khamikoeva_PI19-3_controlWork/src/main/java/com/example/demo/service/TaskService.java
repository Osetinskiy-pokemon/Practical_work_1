package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public void create(Task task){
        taskRepository.save(task);
    }

    public Task update(Task task, Task taskFromDB){
        BeanUtils.copyProperties(task, taskFromDB, "id");
        return taskRepository.save(task);
    }

    public boolean delete(Task task) {
        if (task != null){
            taskRepository.delete(task);
            return true;
        }
        return false;
    }
}

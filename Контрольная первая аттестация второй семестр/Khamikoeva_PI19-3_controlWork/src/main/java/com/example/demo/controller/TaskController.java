package com.example.demo.controller;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    private final TaskService taskService;

    @Autowired
    public TaskController(TaskService taskService) {this.taskService = taskService; }

    //получение значения по login
    @GetMapping(value = "/{id}")
    public ResponseEntity<Task> getOne(@PathVariable(name = "id") Task task) {
        final Task currentTask = task;
        return task != null
                ? new ResponseEntity<>(currentTask, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<?> create (@RequestBody Task task){
        taskService.create(task);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping
    private ResponseEntity<List<Task>> readAll(){
        final List<Task> taskList = taskService.findAll();
        return taskList != null && !taskList.isEmpty()
                ? new ResponseEntity<>(taskList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<?> put(@PathVariable(name = "id") Task taskFromDB,
                                 @RequestBody Task task){
        Task updatedTask = taskService.update(task, taskFromDB);
        return updatedTask != null
                ? new ResponseEntity<>(updatedTask, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<List<Task>> delete(@PathVariable(name = "id") Task task){
        if (taskService.delete(task)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

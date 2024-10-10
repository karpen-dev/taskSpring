package com.karpen.testapi.controller;

import com.karpen.testapi.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final List<Task> tasks = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    @GetMapping
    public List<Task> getAllTasks(){
        return tasks;
    }

    @PostMapping
    public Task createTask(@RequestBody String description){
        Task newTask = new Task(counter.incrementAndGet(), description);
        tasks.add(newTask);
        return newTask;
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id){
        tasks.removeIf(task -> task.getId().equals(id));
        return "Task with ID " + id + "deleted.";
    }
}

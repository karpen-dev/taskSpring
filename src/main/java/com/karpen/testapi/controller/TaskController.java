package com.karpen.testapi.controller;

import com.karpen.testapi.repository.TaskRepository;
import com.karpen.testapi.model.Task;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    private final TaskRepository taskRepository = new TaskRepository();
    private final AtomicLong counter = new AtomicLong();
    private List<Task> tasks;

    public TaskController(){
        tasks = taskRepository.readTasks();

        if (!tasks.isEmpty()){
            tasks.forEach(task -> counter.updateAndGet(value -> Math.max(value, task.getId())));
        }
    }

    @GetMapping
    public List<Task> getAllTasks(){
        return tasks;
    }

    @PostMapping
    public Task createTask(@RequestBody String description){
        Task newTask = new Task(counter.incrementAndGet(), description);
        tasks.add(newTask);
        taskRepository.writeTasks(tasks);
        return newTask;
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable Long id){
        tasks.removeIf(task -> task.getId().equals(id));
        taskRepository.writeTasks(tasks);

        return "Task with ID " + id + "deleted.";
    }
}

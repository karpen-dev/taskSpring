package com.karpen.testapi.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.karpen.testapi.model.Task;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    private final File file = new File("tasks.db");
    private final ObjectMapper objectMapper = new ObjectMapper();

    public List<Task> readTasks(){
        if (!file.exists()){
            return new ArrayList<>();
        }

        try {
            return objectMapper.readValue(file, new TypeReference<List<Task>>() {
            });
        } catch (IOException e){
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void writeTasks(List<Task> tasks){
        try {
            objectMapper.writeValue(file, tasks);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}

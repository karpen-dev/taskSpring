package com.karpen.testapi.model;

public class Task {
    private Long id;
    private String description;

    public Task(Long id , String description){
        this.id = id;
        this.description = description;
    }

    public Long getId(){
        return id;
    }

    public String getDescription(){
        return description;
    }
}

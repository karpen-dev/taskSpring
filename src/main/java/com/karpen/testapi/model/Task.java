package com.karpen.testapi.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Task {
    private Long id;
    private String description;

    public Task(){

    }

    @JsonCreator
    public Task(@JsonProperty("id") Long id, @JsonProperty("description")  String description){
        this.id = id;
        this.description = description;
    }

    public Long getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }
}

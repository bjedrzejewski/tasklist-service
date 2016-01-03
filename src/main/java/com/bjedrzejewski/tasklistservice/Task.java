package com.bjedrzejewski.tasklistservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

/**
 * Created by bartoszjedrzejewski on 03/01/2016.
 */
public class Task {
    private long id;

    private String name;

    public Task() {
        // Jackson deserialization
    }

    public Task(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getName() {
        return name;
    }
}

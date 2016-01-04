package com.bjedrzejewski.tasklistservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by bartoszjedrzejewski on 03/01/2016.
 */
public class Task {
    private long id;

    private String content;

    public Task() {
        // Jackson deserialization
    }

    public Task(long id, String content) {
        this.id = id;
        this.content = content;
    }

    @JsonProperty
    public long getId() {
        return id;
    }

    @JsonProperty
    public String getContent() {
        return content;
    }
}

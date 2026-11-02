package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;
import java.util.UUID;

public class Task {
    private UUID id;
    private String description;
    private Status status;

    public Task() {}

    public Task(UUID id, String description, Status status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public Status getStatus() {
        return status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


}

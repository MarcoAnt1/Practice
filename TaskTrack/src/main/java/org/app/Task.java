package org.app;

import java.time.LocalDateTime;
import java.util.UUID;

public class Task {
    private UUID id;
    private String description;
    private Status status;
    private LocalDateTime test;

    public Task() {}

    public Task(UUID id, String description, Status status) {
        this.id = id;
        this.description = description;
        this.status = status;
        test = LocalDateTime.now();
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

package org.example;

import java.util.ArrayList;
import java.util.List;

public class Tasks {
    private List<Task> tasks;

    public Tasks() {
        tasks = new ArrayList<>();
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}

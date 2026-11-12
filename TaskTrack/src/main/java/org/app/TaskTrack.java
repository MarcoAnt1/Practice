package org.app;

import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;

public class TaskTrack {
    private List<Task> tasks;
    private final Gson gson;

    public TaskTrack() throws IOException {
        gson = new Gson();

        var file = new File("mydata.json");
        if (file.exists()) {
            Type listType = new TypeToken<ArrayList<Task>>(){}.getType();
            var reader = new JsonReader(new FileReader("mydata.json"));
            List<Task> tasks1 = gson.fromJson(reader, listType);
            tasks = Objects.requireNonNullElseGet(tasks1, ArrayList::new);

        } else {
            tasks = new ArrayList<>();
            saveJson();
        }
    }

    public void addTask(String description) throws IOException {
        var task = new Task(UUID.randomUUID(), description, Status.TODO);
        tasks.add(task);

        var task1 = new Task(UUID.randomUUID(), description, Status.TODO);
        tasks.add(task1);

        saveJson();
    }

    private void saveJson() {
        try {
            var writer = new FileWriter("mydata.json");
            gson.toJson(tasks, writer);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

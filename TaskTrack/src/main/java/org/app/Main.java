package org.app;

public class Main {
    static void main(String[] args) {
        try {
            var taskTracker = new TaskTrack();
            taskTracker.addTask("Test");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

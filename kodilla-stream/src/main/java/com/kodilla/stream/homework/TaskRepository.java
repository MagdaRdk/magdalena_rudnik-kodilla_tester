package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTask() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("go to the dentists", LocalDate.now(), LocalDate.of(2020, 7, 25)));
        tasks.add(new Task("buy a medicine", LocalDate.now(), LocalDate.of(2020, 7, 28)));
        tasks.add(new Task("go to the cinema", LocalDate.now(), LocalDate.of(2020, 7, 15)));
        tasks.add(new Task("wash car", LocalDate.of(2020, 5, 15), LocalDate.of(2020, 6, 5)));
        return tasks;
    }
}

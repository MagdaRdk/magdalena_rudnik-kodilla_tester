package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTask()
                .stream()
                .filter(k -> k.getDeadline().isAfter(LocalDate.now()))
                .map(k -> k.getDeadline())
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
}

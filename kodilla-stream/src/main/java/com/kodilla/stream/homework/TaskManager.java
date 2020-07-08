package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTask()
                .stream()
                .filter(k -> k.getOpened().equals(LocalDate.now()))
                /* TODO: utworzona zostanie lista List<LocalDate> zawierająca daty deadline wszystkich zadań, których data deadline jeszcze nie upłynęła.
                *   You filtered only tasks that were opened now*/
                .map(k -> k.getDeadline())
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
}

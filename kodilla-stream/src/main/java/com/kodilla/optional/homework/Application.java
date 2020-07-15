package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Zbigniew Kowalski")));
        students.add(new Student("Marek Nowak", null));
        students.add(new Student("Ania Machnik", new Teacher("Adrian Nowak")));
        students.add(new Student("Amelia Kozioł", null));

        for (Student student : students) {
            System.out.println("Uczeń: " + student.getName() + " Nauczyciel: " + Optional
                    .ofNullable(student.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>"));
        }
    }
}

package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", new Teacher("Kowalski")));// jak podać tu nazwisko nauczyciela?
        students.add(new Student("Marek Nowak", null));
        students.add(new Student("Ania Machnik", new Teacher("Nowak")));
        students.add(new Student("Amelia Kozioł", null));

        Optional<List<Student>> optionalStudent = Optional.ofNullable(students);//TODO Review - not needed

        for (Student student : students) {
            System.out.println(Optional
                    .ofNullable(student.getTeacher()) //check if teacher == null
                    .map(Teacher::getName) //if Teacher exists - get his name
                    .orElse("<undefined>")); //else - undefined
        }
    }
}

package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {

       List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", " "));// jak podać tu nazwisko nauczyciela?
        students.add(new Student("Marek Nowak", null));
        students.add(new Student("Ania Machnik", " "));
        students.add(new Student("Amelia Kozioł", null));


        Optional<List<Student>> optionalStudent = Optional.ofNullable(students);

       for (Student student : students) {
            if (optionalStudent== null)
                System.out.println("Student " + getName + "Teacher <undefined>)
                        else
                System.out.println("Student" + getName + "Teacher" + getName);
                   } // czy zarys tej pętli jest poprawny?
    }
}

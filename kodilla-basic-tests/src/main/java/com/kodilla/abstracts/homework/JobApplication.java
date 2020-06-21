package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.getResponsibilities();

        Builder builder = new Builder();
        builder.getResponsibilities();

        Teacher teacher = new Teacher();
        teacher.getResponsibilities();


        Person person = new Person("Magda", 31, teacher);
        Person person2 = new Person("Wojtek", 55, new Builder());
        person.getData1();
        person2.getData1();
    }
}

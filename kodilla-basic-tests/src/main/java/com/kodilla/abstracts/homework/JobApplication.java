package com.kodilla.abstracts.homework;

public class JobApplication {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();
        doctor.getResponsibilities();

        Builder builder = new Builder();
        builder.getResponsibilities();

        Teacher teacher = new Teacher();
        teacher.getResponsibilities();

        Person person = new Person();
        person.getData1();
    }
}

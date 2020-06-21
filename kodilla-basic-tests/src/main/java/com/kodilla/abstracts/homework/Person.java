package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void getData1() {
        System.out.println(firstName + " is " + age + " and works as a " + job.getClass().getSimpleName());
    }


}

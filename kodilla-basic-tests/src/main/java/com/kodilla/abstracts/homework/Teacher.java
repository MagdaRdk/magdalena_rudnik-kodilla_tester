package com.kodilla.abstracts.homework;

public class Teacher extends Job{
    public Teacher() {
        super(3200, "teach people");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Teacher teach people");
    }
}

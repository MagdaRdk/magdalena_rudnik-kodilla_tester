package com.kodilla.abstracts.homework;

public class Doctor extends Job{
    public Doctor() {
        super(5000, "heals people");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Doctor heals people");
    }
}

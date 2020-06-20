package com.kodilla.abstracts.homework;

public class Builder extends Job{
    public Builder() {
        super(4500, "build a house");
    }

    @Override
    public void getResponsibilities() {
        System.out.println("Builder build a house");
    }
}

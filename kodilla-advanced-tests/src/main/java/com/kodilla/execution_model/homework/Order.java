package com.kodilla.execution_model.homework;

import java.time.LocalDate;

public class Order {
    private String userName;
    private double value;
    private LocalDate date;

    public Order(String userName, double value, LocalDate date) {
        this.userName = userName;
        this.value = value;
        this.date = date;
    }

    public String getUserName() {
        return userName;
    }

    public double getValue() {
        return value;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Order{" +
                "userName='" + userName + '\'' +
                ", value=" + value +
                ", date='" + date + '\'' +
                '}';
    }
}

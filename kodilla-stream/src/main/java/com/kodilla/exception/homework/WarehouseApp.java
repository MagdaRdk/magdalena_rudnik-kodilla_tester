package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("101"));
        orders.add(new Order("102"));
        orders.add(new Order("103"));
        orders.add(new Order("105"));

        /* //dobrze rozumiem, że tu ma pojawić się blok try,catch?

         }
}

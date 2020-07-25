package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder(LocalDate date) {
        if (date.isAfter(LocalDate.of(2018, 7, 20)) && date.isBefore(LocalDate.of(2020, 7, 20)));
            return this.getOrder(date);
            }

    public Order getOrderFromScope(double scope) {
        public List<Order> getOrders(double priceFrom, double priceTo)


        //and you follow the list and filter the proper Orders
    }

    public int getSize() {
        return this.orders.size();
    }

    public double sumAll() {
        double sum = 0;
        for (int i = 0 ; i < this.orders.size(); i++) {
            sum += this.orders.size();
        }
        return sum;
    }
}

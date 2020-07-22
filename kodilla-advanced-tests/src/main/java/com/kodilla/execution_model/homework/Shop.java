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
        if (date.isAfter(LocalDate.of(2018,7,20)))
            return this.orders.get(); //jak wpisać zakres tych dwóch lat? -> TODO if (date.isAfter(LocalDate.of(2018,7,20)) && date.isBefore(LocalDate.of ....)
    }

    public Order getOrderFromScope(double scope) {
        if // jak największy i najmniejszy zapisać -> TODO public List<Order> getOrders(double priceFrom, double priceTo)
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

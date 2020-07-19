package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public Order getOrder(String number) throws OrderDoesntExistException {
        var order = this.orders.stream()
                .filter(o -> number.equals(o.getNumber()))
                .collect(Collectors.toList());
        if (order.isEmpty())
            throw new OrderDoesntExistException();
        return order.get(0);

    }

    public Order getOrder2(String number) throws OrderDoesntExistException {
        var order = this.orders.stream()
                .filter(o -> number.equals(o.getNumber()))
                .findAny();
        if (order.isEmpty())
            throw new OrderDoesntExistException();
        return order.get();
    }

}

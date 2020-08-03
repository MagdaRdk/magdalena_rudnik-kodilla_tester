package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrderFromScope(LocalDate start, LocalDate end) {
        return this.orders
                .stream()
                .filter(p -> p.getDate().isAfter(start)  && p.getDate().isBefore(end))
                .collect(Collectors.toList());
    }

    public List<Order> getOrders(double priceFrom, double priceTo) {
        return this.orders.stream()
                .filter(o -> o.getValue() > priceFrom && o.getValue() < priceTo)
                .collect(Collectors.toList());
    }

    public int getSize() {
        return this.orders.size();
    }

    public double sumAll() {
        return this.orders.stream()
                .filter(k -> k.getDate().isAfter(LocalDate.of(2019, 1,1)))
                .map(k -> k.getValue())
                .mapToDouble(n -> n)
                .sum();

    }
}

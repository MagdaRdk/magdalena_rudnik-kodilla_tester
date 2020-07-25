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

    public List<Order> getOrderFromScope(LocalDate date) {
        return this.orders.stream()
                .filter(p -> p.getDate().isAfter(LocalDate.of(2019, 7, 20)) && p.getDate().isBefore(LocalDate.of(2020, 7, 20)))
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

    public List<Order> sumAll() {
        return this.orders.stream()
                .filter(k -> k.getValue()) //dlaczego nie mogę odfiltrować wartości zamówienia, żeby potem zsumować?
                .map(k -> k.getValue())
                .sum()
                .getAsDouble;

    }
}

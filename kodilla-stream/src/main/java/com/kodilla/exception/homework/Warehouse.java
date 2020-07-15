package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Warehouse {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

  /* public Order getOrder(String number) throws OrderDoesntExistException {
       List<Order> orders = new Order()
               .stream()
               .map(k -> getOrder(number));
       System.out.println(orders);

        throw new OrderDoesntExistException();

    } */ //podpowiesz co ja robię tu źle. Nie mogę ruszyć dalej.

}

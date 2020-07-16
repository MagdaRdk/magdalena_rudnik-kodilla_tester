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

   public Order getOrder(String number) throws OrderDoesntExistException {
       this.orders.stream()
               .map(k -> k.getNumber());/*TODO Review use .filter here*/
       System.out.println(orders);

        throw new OrderDoesntExistException();

    }

}

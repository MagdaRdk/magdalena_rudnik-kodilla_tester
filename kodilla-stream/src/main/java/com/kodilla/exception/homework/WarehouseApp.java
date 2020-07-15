package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        var order1 = new Order("101");
        var order2 = new Order("102");
        var order3 = new Order("103");
        var order4 = new Order("105");

        warehouse.addOrder(order1);
        warehouse.addOrder(order2);
        warehouse.addOrder(order3);
        warehouse.addOrder(order4);

        try {
            Order isOrderNumberExist = warehouse.getOrder("104");
            System.out.println("Order" + isOrderNumberExist);
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order does not exist.");
        } finally {
            System.out.println("Thank you for using our system");
        }
    }
}


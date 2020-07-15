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

        warehouse.addOrder(order1); //TODO Review add all orders
        /* //dobrze rozumiem, że tu ma pojawić się blok try,catch? -> Teraz TAK :)*/

    }
}

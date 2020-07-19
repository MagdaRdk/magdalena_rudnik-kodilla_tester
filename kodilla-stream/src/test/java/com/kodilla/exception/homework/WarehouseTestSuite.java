package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        warehouse.getOrder("103");

    }
    //TODO
}
package com.kodilla.exception.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class WarehouseTestSuite {
   @Test
    public void testGetOrder() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
       Order isOrderNumberExist = warehouse.getOrder("103");
        // then
       assertNull(isOrderNumberExist); //why the test is failed? -> because Java compiler doesn´t even reach this line, Execution stops when Exception is thrown in getOrder
       //TODO Review -> remove this test, testGetOrder_withException() does the job

    }

    @Test(expected = OrderDoesntExistException.class)
    public void testGetOrder_withException() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
        Order isOrderNumberExist = warehouse.getOrder("104");
        // then
        assertNotNull(isOrderNumberExist);

    }

}
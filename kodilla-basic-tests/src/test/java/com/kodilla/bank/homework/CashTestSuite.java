package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_asseration.ResultChecker.assertEquals;

public class CashTestSuite {

    @Test
    public void shouldHaveZeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] payments = cashMachine.getPayments();
        assertEquals(0,payments.length);
    }

    @Test
    public void shouldAddTwoElementsToArray() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(450);

        int[] payments = cashMachine.getPayments();
        assertEquals(2, payments.length);
        assertEquals(200, payments[0]);
        assertEquals(450, payments[1]);
    }

    @Test
    public void shouldCalculateSum() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(200);
        cashMachine.add(450);
        cashMachine.add(-200);

        Assertions.assertEquals(450, cashMachine.getSum(), 0.01);
    }
}

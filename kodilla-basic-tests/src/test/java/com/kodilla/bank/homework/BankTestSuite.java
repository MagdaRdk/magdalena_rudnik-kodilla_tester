package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class BankTestSuite {

    @Test
    public void shouldHaveZeroLengthPayment() {
        Bank bank = new Bank();
        int payments = bank.getPayments();
        Assertions.assertEquals(0, payments);
    }

    @Test
    public void shouldHaveZeroLengthPayoff() {
        Bank bank = new Bank();
        int payoff = bank.getPayoff();
        Assertions.assertEquals(0, payoff);
    }

    @Test
    public void shouldCalculateTotalSum() {
        Bank bank = new Factory().createBank();
        bank.getTotalSum();
        Assertions.assertEquals(-10, bank.getTotalSum(), 0.01);
    }
}


package com.kodilla.bank.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_asseration.ResultChecker.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldHaveZeroLengthPayment() {
        Bank bank = new Bank();
        int[] payments = bank.getPayments();
        assertEquals(0, payments.length);
    }

    @Test
    public void shouldHaveZeroLengthPayoff() {
        Bank bank = new Bank();
        int[] payoff = bank.getPayoff();
        assertEquals(0, payoff.length);
    }
}


package com.kodilla.bank.homework;

public class CashMachine {
    private int[] payments;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.payments = new int[0];
    }

    public void add(int value) {
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(payments, 0, newTab, 0, payments.length);
        newTab[this.size - 1] = value;
        this.payments = newTab;
    }

    public int[] getPayments() {
        return payments;
    }

    public double getSum() {
        if (this.payments.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.payments.length; i++) {
            sum += this.payments[i];
        }
        return sum;
    }
}

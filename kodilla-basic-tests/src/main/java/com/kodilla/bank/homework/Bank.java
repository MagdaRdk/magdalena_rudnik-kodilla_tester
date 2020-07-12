package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private int[] cashMachines;
    private int[] payments;
    private int[] payoff;
    private int size;

    public Bank() {
        this.name = "CashMachine";
        this.cashMachines = new int[5];
        this.payments = new int[5];
        this.payoff = new int[5];
        this.size = 0;
    }

    public double getTotalSum() {
        if (this.cashMachines.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += this.cashMachines[i];
        }
        return sum;
    }
    public int[] getPayments() {
        return payments;
    }
    public int[] getPayoff() {
        return payoff;
    }
    public double getAveragePayments() {
        double sum = 0;
        for(int i = 0; i < this.payments.length; i++) {
            sum += this.payments[i];
        }
        return sum/this.payments.length;
    }
    public double getAveragePayoff() {
        double sum = 0;
        for (int i = 0; i < this.payoff.length; i++) {
            sum += this.payoff[i];
        }
        return sum / this.payoff.length;
    }
}





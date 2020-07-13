package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine[] cashMachines;

    public Bank() {
        this.name = "CashMachine";
        this.cashMachines = new CashMachine[5];
        for (int i = 0; i < cashMachines.length; i++)
            cashMachines[i] = new CashMachine();
    }

    public CashMachine[] getCashMachines() {
        return cashMachines;
    }

    public double getTotalSum() {
        double sum = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            for (int a = 0; a < cashMachine.getPayments().length; a++)
                sum += cashMachine.getPayments()[a];
        }
        return sum;
    }

    public int getPayments() {
        int amount = 0;
        for (CashMachine c : this.cashMachines) {
            for (int p : c.getPayments()) {
                if (p > 0) {
                    amount = amount + 1;
                }
            }
        }
        return amount;
    }

    public int getPayoff() {
        int amount1 = 0;
        for (CashMachine c : this.cashMachines) {
            for (int p : c.getPayments()) {
                if (p < 0) {
                    amount1 = amount1 + 1;
                }
            }
        }
        return amount1;
    }

    public double getAveragePayments() {
        if (getPayments() == 0) {
            return 0;
        }
        double sum = 0;
        for (CashMachine c : this.cashMachines) {
            for (int p : c.getPayments()) {
                sum += p;
            }

        }
        return sum / getPayments();
    }

    public double getAveragePayoff() {
        if (getPayoff() == 0) {
            return 0;
        }
        double sub = 0;
        for (CashMachine c : this.cashMachines) {
            for (int p : c.getPayments()) {
                sub += p;
            }

        }
        return sub / getPayments();
    }
}





package com.kodilla.bank.homework;

public class Factory {
    public Bank createBank() {
        Bank bank = new Bank();
        for (int i = 0; i < bank.getCashMachines().length; i++) {
            bank.getCashMachines()[i].add(200 - i);
            bank.getCashMachines()[i].add(50 * i);
            bank.getCashMachines()[i].add(-300);
        }
        return bank;
    }

}

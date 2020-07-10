package com.kodilla.bank.homework;

public class Bank {
    private String name;
    private CashMachine first;
    private CashMachine second;
    private  CashMachine third;

    public Bank(String name) {
        this.name = name;
        this.first = new CashMachine();
        this.second = new CashMachine();
        this.third = new CashMachine();
    }
    public void addCashMachineFirst (int payment) {
        if (payment > 0 && payment < 1000) {
            this.first.add(payment);
        }
    }
    public void addCashMachineSecond (int payment) {
        if (payment > 0 && payment < 1000) {
            this.second.add(payment);
        }
    }
    public void addCashMachineThird (int payment) {
        if (payment > 0 && payment < 1000) {
            this.third.add(payment);
        }
    }
    public void addCashMachineFirstM (int payoff) {
        if (payoff < 0 && payoff > -1000) {
            this.first.add(payoff);
        }
    }
    public void addCashMachineSecondM (int payoff) {
        if (payoff < 0 && payoff > -1000) {
            this.second.add(payoff);
        }
    }
    public void addCashMachineThirdM (int payoff) {
        if (payoff < 0 && payoff > -1000) {
            this.third.add(payoff);
        }
    }
    public double getFirstSum () {
        return this.first.getSum();
    }
    public double getSecondSum() {
        return this.second.getSum();
    }
    public double getThirdSum() {
        return this.third.getSum();
    }
    public double getFirstSumM () {
        return this.first.getSum();
    }
    public double getSecondSumM() {
        return this.second.getSum();
    }
    public double getThirdSumM() {
        return this.third.getSum();
    }

    public double getTotalSum() {
        double sumTot = this.first.getSum() + this.second.getSum() + this.third.getSum()+this.first.getSum()+this.second.getSum()+this.third.getSum();
        return sumTot;
    }
    }





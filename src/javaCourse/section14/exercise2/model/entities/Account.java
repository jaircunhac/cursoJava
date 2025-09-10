package javaCourse.section14.exercise2.model.entities;

import javaCourse.section14.exercise2.model.exceptions.WithdrawException;

public class Account {
    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) throws WithdrawException {
        if (amount > withdrawLimit) {
            throw new WithdrawException("The amount exceeds withdraw limit");
        } else if (amount > balance || balance == 0) {
            throw new WithdrawException("Not enough balance");
        }

        balance -= amount;
    }

    public Account() {
    }

    public Account(Integer number, String holder, double balance, double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}

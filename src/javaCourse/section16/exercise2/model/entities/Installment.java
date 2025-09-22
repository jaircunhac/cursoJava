package javaCourse.section16.exercise2.model.entities;

import java.util.Date;

public class Installment {
    private Date dueDate;
    private double amount;

    private Contract contract;

    public Installment() {
    }

    public Installment(Date dueDate, double amount, Contract contract) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.contract = contract;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }
}

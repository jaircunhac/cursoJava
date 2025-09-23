package javaCourse.section16.exercise2.model.entities;

import java.time.LocalDate;
import java.util.Date;

public class Installment {
    private LocalDate dueDate;
    private double amount;

    private Contract contract;

    public Installment() {
    }

    public Installment(LocalDate dueDate, double amount, Contract contract) {
        this.dueDate = dueDate;
        this.amount = amount;
        this.contract = contract;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
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

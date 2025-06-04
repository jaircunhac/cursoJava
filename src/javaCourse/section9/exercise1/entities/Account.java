package javaCourse.section9.exercise1.entities;

public class Account {
    private final int accountNumber;
    private String ownerName;
    private double balance;

    public Account(int accountNumber, String ownerName) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }



    public void deposit(double value){
        balance += value;
    }

    public void withdrawal(double value){
        balance -= value + 5;
    }



    public String toString() {
        return "Account: " + accountNumber + ", Holder: " + ownerName + ", Balance: $ " + String.format("%.2f", balance);
    }
}

package javaCourse.section13;

import javaCourse.section13.entities.Account;
import javaCourse.section13.entities.BusinessAccount;
import javaCourse.section13.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class ProgramAbstract {
    public static void main(String[] args) {

        List<Account> accountList = new ArrayList<>();

        accountList.add(new SavingsAccount(1001, "Jair", 10000.00, 0.01));
        accountList.add(new BusinessAccount(1002, "Maria", 1000.00, 3500.00));
        accountList.add(new SavingsAccount(1003, "Leo", 5000000.00, 0.01));
        accountList.add(new BusinessAccount(1004, "Patricia", 50000.00, 35000.00));

        double sum = 0.0;
        for(Account acc : accountList){
            sum += acc.getBalance();
        }

        System.out.println("Total balance: " + sum);

        for (Account acc : accountList){
            acc.deposit(10.0);
        }
        for (Account acc : accountList){
            System.out.println("Updated balance for account " + acc.getNumber() + ": " + acc.getBalance());
        }
    }
}

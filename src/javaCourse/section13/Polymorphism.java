package javaCourse.section13;

import javaCourse.section13.entities.Account;
import javaCourse.section13.entities.SavingsAccount;

public class Polymorphism {
    public static void main(String[] args) {
//        Account x = new Account(1001, "Jair", 1000.0);
        Account y = new SavingsAccount(1002, "Maria", 1000.0, 0.5);

//        x.withdraw(100.0);
        y.withdraw(100.0);
    }
}

package javaCourse.section13;

import javaCourse.section13.entities.Account;
import javaCourse.section13.entities.BusinessAccount;
import javaCourse.section13.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Jair", 9000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Leo", 0.0, 1500.0);
        Account acc3 = new SavingsAccount(1004, "Patricia", 0.0, 5500.0);
    }
}

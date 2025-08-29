package javaCourse.section13;

import javaCourse.section13.entities.Account;
import javaCourse.section13.entities.BusinessAccount;
import javaCourse.section13.entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {
        Account acc = new Account(1001, "Jair", 9000.0);
        BusinessAccount bacc = new BusinessAccount(1002, "Maria", 9000.0, 500.0);

        // UPCASTING

        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Leo", 9000.0, 1500.0);
        Account acc3 = new SavingsAccount(1004, "Patricia", 9000.0, 5500.0);

        // DOWNCASTING

        BusinessAccount acc4 = (BusinessAccount)acc2;
        acc4.loan(100.0);

        //BusinessAccount acc5 = (BusinessAccount)acc3; // Problem in the execution because the compiler does not recognise that acc3 is not a BusinessAccount (is a SavingsAccount)

        // It will work this way because of the verification
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc6 = (BusinessAccount)acc3;
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc7 = (SavingsAccount)acc3;
        }

        // OVERRIDE

        acc.withdraw(100.0);
        System.out.println(acc.getBalance());
        acc3.withdraw(100.0);
        System.out.println(acc3.getBalance());
        acc2.withdraw(100.0); // The problem here is the declaration of the var acc2
        System.out.println(acc2.getBalance());
    }
}

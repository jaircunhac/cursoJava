package javaCourse.section14.exercise2;

import javaCourse.section14.exercise2.model.entities.Account;
import javaCourse.section14.exercise2.model.exceptions.WithdrawException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = sc.nextDouble();

        Account account = new Account(number, holder, initialBalance, withdrawLimit);

        try {
            System.out.println(); // Only to break a line

            System.out.print("Enter the amount for withdraw: ");
            double amount = sc.nextDouble();
            account.withdraw(amount);

            System.out.print("New balance: " + account.getBalance());
        } catch (WithdrawException e) {
            System.out.println("Withdraw error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

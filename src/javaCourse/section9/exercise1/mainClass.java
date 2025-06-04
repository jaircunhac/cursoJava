package javaCourse.section9.exercise1;

import javaCourse.section9.exercise1.entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();

        Account account = new Account(accountNumber, accountHolder);

        System.out.print("Is there a initial deposit (y/n)?");
        char answer = sc.next().charAt(0);

        if (answer == 'y'){
            System.out.print("Enter the initial deposit value: ");
            account.deposit(sc.nextDouble());

            System.out.println("Account data:");
            System.out.println(account);

            System.out.print("Enter a deposit value: ");
            account.deposit(sc.nextDouble());
            System.out.println("Updated account value:");
            System.out.println(account);

            System.out.print("Enter a withdrawal value: ");
            account.withdrawal(sc.nextDouble());
            System.out.println("Updated account value:");
            System.out.println(account);
        } else if (answer == 'n') {
            System.out.println("Account data:");
            System.out.println(account);

            System.out.print("Enter a deposit value: ");
            account.deposit(sc.nextDouble());
            System.out.println("Updated account value:");
            System.out.println(account);

            System.out.print("Enter a withdrawal value: ");
            account.withdrawal(sc.nextDouble());
            System.out.println("Updated account value:");
            System.out.println(account);
        } else {
            System.out.println("Invalid answer");
        }

        sc.close();
    }
}

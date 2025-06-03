package javaCourse.section8.exercise4;

import javaCourse.section8.exercise4.entities.CurrencyConverter;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.printf("What is the price of the dollar? %.2f%n", CurrencyConverter.dollar);

        System.out.print("How many dollars do you want to buy? ");
        int amount = sc.nextInt();

        System.out.println("Amount to be paid = " + CurrencyConverter.buyingDollars(amount));
    }
}

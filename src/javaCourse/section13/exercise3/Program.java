package javaCourse.section13.exercise3;

import javaCourse.section13.exercise3.entities.Contributor;
import javaCourse.section13.exercise3.entities.PessoaFisica;
import javaCourse.section13.exercise3.entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Contributor> contributorList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int numPayers = sc.nextInt();
        System.out.println();

        for (int aux = 1; aux <= numPayers; aux++){
            System.out.println("Tax payer #" + aux + " data:");

            System.out.print("Individual or Company (i/c)? ");
            char c = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Annual income: ");
            double annualIncome = sc.nextDouble();

            if (c == 'i'){
                System.out.print("Health costs: ");
                double healthCosts = sc.nextDouble();

                contributorList.add(new PessoaFisica(name, annualIncome, healthCosts));
            } else if (c == 'c') {
                System.out.print("Number of employees: ");
                int numFunc = sc.nextInt();

                contributorList.add(new PessoaJuridica(name, annualIncome, numFunc));
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        double sum = 0;

        for (Contributor contributor : contributorList){
            System.out.println(contributor.getName() + ": $ " + contributor.tax());

            sum += contributor.tax();
        }

        System.out.println();
        System.out.println("TOTAL TAXES: " + sum);

        sc.close();
    }
}

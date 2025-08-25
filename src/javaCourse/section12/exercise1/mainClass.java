package javaCourse.section12.exercise1;

import javaCourse.section12.exercise1.entities.Department;
import javaCourse.section12.exercise1.entities.HourContract;
import javaCourse.section12.exercise1.entities.Worker;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Department department = new Department();
        Worker worker = new Worker();
        HourContract hourContract = new HourContract();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the department name: ");
        department.setName(sc.next());

        // INSERTION OF WORKER DATA

//        System.out.println("Enter worker data:");
//
//        System.out.print("Name: ");
//        worker.setName(sc.next());
//
//        System.out.print("Level: ");
//        worker.setLevel(sc.next());
//
//        System.out.print("Base salary: ");
//        worker.setBaseSalary(sc.nextDouble());

        // INSERTION OF CONTRACTS

        System.out.print("How many contracts to this worker: ");
        int contracts = sc.nextInt();

        int[] vec = new int[contracts];

        for(int aux=0; aux<vec.length; aux++){
            System.out.printf("Enter contract #%d data: %n", aux + 1);
            System.out.print("Date (DD/MM/YYYY): ");
            String dateInText = sc.next();

            Date date = Date.parse(dateInText);

            hourContract.setDate(date);

            System.out.print("Value per hour: ");
            hourContract.setValuePerHour(sc.nextDouble());

            System.out.print("Duration (hours): ");
            hourContract.setHours(sc.nextInt());
        }

        // SEARCH OF THE INCOME

        System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
        // Insertion of month and year
        System.out.print("Name: ");
        worker.getName();
        System.out.print("Department: ");
        department.getName();

        // INCOME FOR 08/1990: 3,000.00

        sc.close();
    }
}

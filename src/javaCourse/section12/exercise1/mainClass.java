package javaCourse.section12.exercise1;

import javaCourse.section12.exercise1.entities.Department;
import javaCourse.section12.exercise1.entities.HourContract;
import javaCourse.section12.exercise1.entities.Worker;
import javaCourse.section12.exercise1.entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter the department name: ");
        String departmentName = sc.nextLine();

        // INSERTION OF WORKER DATA

        System.out.println("Enter worker data:");

        System.out.print("Name: ");
        String workerName = sc.nextLine();

        System.out.print("Level: ");
        String workerLevel = sc.nextLine();

        System.out.print("Base salary: ");
        double workerSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, new Department(departmentName));

        // INSERTION OF CONTRACTS

        System.out.print("How many contracts to this worker: ");
        int contracts = sc.nextInt();

        for(int aux=1; aux<=contracts; aux++){
            System.out.println("Enter contract #" + aux + " data: ");

            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = sc.nextInt();

            HourContract contract = new HourContract(contractDate, valuePerHour, duration);
            worker.addContract(contract);
        }

        // SEARCH OF THE INCOME

        System.out.print("Enter the month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());

        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}

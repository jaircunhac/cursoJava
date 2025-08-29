package javaCourse.section13.exercise1;

import javaCourse.section13.exercise1.entities.Employee;
import javaCourse.section13.exercise1.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int numEmploy = sc.nextInt();

        List<Employee> ListEmployees = new ArrayList<>();

        for (int aux=1; aux<=numEmploy; aux++){
            System.out.println("Employee #" + aux + " data:");
            System.out.print("Outsourced (y/n)?");
            char isOutsourced = sc.next().charAt(0);

            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double value = sc.nextDouble();

            if (isOutsourced == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                Employee emp = new OutsourcedEmployee(name, hours, value, additionalCharge);

                ListEmployees.add(emp);
            } else if (isOutsourced == 'n') {
                Employee emp = new Employee(name, hours, value);

                ListEmployees.add(emp);
            } else {
                System.out.println("Invalid answer");
            }
        }

        System.out.println("PAYMENTS:");
        for (Employee employee : ListEmployees){
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }

        sc.close();
    }
}

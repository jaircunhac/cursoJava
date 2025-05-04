package javaCourse.section8.exercise3;

import javaCourse.section8.exercise3.entities.Employee;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.next();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee.name + ", " + employee.netSalary());

        System.out.print("Insert the percentage of the increased salary: ");
        employee.increaseSalary(sc.nextDouble());

        System.out.println("Updated data: " + employee.name + ", " + employee.netSalary());
    }
}
package javaCourse.section10.exercise2;

import javaCourse.section10.exercise2.entities.Employee;

import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered: ");
        int amountOfEmployees = sc.nextInt();

        Employee[] vect = new Employee[amountOfEmployees];

        for (int aux = 0; aux < vect.length; aux++){
            System.out.println("Employee #" + (aux + 1));
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            vect[aux] = new Employee(id, name, salary);
        }

        //Could not develop the increase salary logic, I'll do it with the professor.

        System.out.print("Enter the id that will have salary increase: ");
        int id = sc.nextInt();
        System.out.println("Enter the percentage: ");



        System.out.println("List of employees:");

        for (Employee employee : vect){
            System.out.println(employee);
        }

        sc.close();
    }
}

package javaCourse.section10.exercise2;

import javaCourse.section10.exercise2.entities.NelioEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class mainNelioClass {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<NelioEmployee> list = new ArrayList<>();

        System.out.print("How many employee will be registered: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            while(hasId(list, id)){
                System.out.print("Id already taken! Try again: ");
                id = sc.nextInt();
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            NelioEmployee emp = new NelioEmployee(id, name, salary);

            list.add(emp);
        }

        System.out.println("Enter the id of the employee that will have the salary increased: ");
        int idSalary = sc.nextInt();


//        Another way to make the verification
        NelioEmployee nemp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);

//        Integer pos = position(list, idSalary);

        if (nemp == null){
            System.out.println("This id does not exist!");
        } else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            nemp.increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees: ");
        for (NelioEmployee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<NelioEmployee> list, int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getId() == id){
                return i;
            }
        }
        // If I use the type int in the method
        // return -1;
        return null;
    }

    public static boolean hasId(List<NelioEmployee> list, int id){
        NelioEmployee nemp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return nemp != null;
    }
}

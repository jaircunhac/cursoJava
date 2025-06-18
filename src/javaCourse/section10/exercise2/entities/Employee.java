package javaCourse.section10.exercise2.entities;

public class Employee {
    private int id;
    private String name;
    private double salary;

    private int percentIncrease = 10;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPercentIncrease(int percentIncrease) {
        this.percentIncrease = percentIncrease;
    }

    public void increaseSalary(int id){
        if (id == this.id){
            salary += (salary/100) * percentIncrease;
        } else {
            System.out.println("The ID mentioned does not exist.");
        }
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String toString() {
        return id + ", " + name + ", " +  salary;
    }
}
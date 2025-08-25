package javaCourse.section12.exercise1.entities;

import javaCourse.section12.exercise1.entities.enums.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;

    public void addContract(HourContract contract){

    }

    public void removeContract(HourContract contract){

    }

//    public double income(Integer year, Integer month){
//
//    }

    // Getters e Setters


    public String getName() {
        return name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}

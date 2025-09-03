package javaCourse.section13.exercise3.entities;

public abstract class Contributor {
    private String name;
    protected double annualIncome;

    public abstract double tax();

    public Contributor(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public Contributor() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }
}

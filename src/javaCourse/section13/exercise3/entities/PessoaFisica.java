package javaCourse.section13.exercise3.entities;

public class PessoaFisica extends Contributor{
    private double healthCosts;

    @Override
    public double tax() {
        double taxValue;

        if (annualIncome < 20000){
            if (healthCosts != 0){
                taxValue = annualIncome * 0.15 - (healthCosts * 0.5);
            } else{
                taxValue = annualIncome * 0.15;
            }
        } else {
            if (healthCosts != 0){
                taxValue = annualIncome * 0.25 - (healthCosts * 0.5);
            } else{
                taxValue = annualIncome * 0.25;
            }
        }

        return taxValue;
    }

    public PessoaFisica(String name, double annualIncome, double healthCosts) {
        super(name, annualIncome);
        this.healthCosts = healthCosts;
    }

    public PessoaFisica() {
        super();
    }

    public double getHealthCosts() {
        return healthCosts;
    }

    public void setHealthCosts(double healthCosts) {
        this.healthCosts = healthCosts;
    }
}

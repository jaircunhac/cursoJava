package javaCourse.section13.exercise3.entities;

public class PessoaJuridica extends Contributor{
    private int numFunc;

    @Override
    public double tax() {
        double taxValue;

        if (numFunc > 10){
            taxValue = annualIncome * 0.14;
        } else {
            taxValue = annualIncome * 0.16;
        }

        return taxValue;
    }

    public PessoaJuridica(String name, double annualIncome, int numFunc) {
        super(name, annualIncome);
        this.numFunc = numFunc;
    }

    public PessoaJuridica() {
    }

    public int getNumFunc() {
        return numFunc;
    }

    public void setNumFunc(int numFunc) {
        this.numFunc = numFunc;
    }
}

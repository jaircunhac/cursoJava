package javaCourse.section13.exercise1.entities;

public class OutsourcedEmployee extends Employee {
    private double additionalCharge;

    @Override
    public double payment(){
        return super.payment() + additionalCharge * 1.1;
    }

    public OutsourcedEmployee() {
        super();
    }

    public OutsourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }
}

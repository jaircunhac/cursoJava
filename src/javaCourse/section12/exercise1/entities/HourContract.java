package javaCourse.section12.exercise1.entities;

import java.util.Date;

public class HourContract {
    private Date date;
    private double valuePerHour;
    private Integer hours;

    public double totalValue(){
        return valuePerHour * hours;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}

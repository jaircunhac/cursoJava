package javaCourse.section8.exercise4.entities;

public class CurrencyConverter {

    public static final double dollar = 5.68;

    public static double buyingDollars(int amount){
        return amount * dollar + (amount * dollar * 0.06);
    }
}

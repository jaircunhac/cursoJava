package javaCourse.section16.exercise2.model.service;

public class PaypalService implements OnlinePaymentService{
    @Override
    public double interest(double amount, int months) {
        return 0;
    }

    @Override
    public double paymentFee(double amount) {
        return 0;
    }
}

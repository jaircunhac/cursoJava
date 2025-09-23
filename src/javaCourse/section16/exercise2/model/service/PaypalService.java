package javaCourse.section16.exercise2.model.service;

public class PaypalService implements OnlinePaymentService{
    @Override
    public double interest(double amount, int months) {
        // 1%

        return amount * (0.01 * months);
    }

    @Override
    public double paymentFee(double amount) {
        // 2%

        return amount * 0.02;
    }
}

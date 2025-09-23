package javaCourse.section16.exercise2.model.service;

import javaCourse.section16.exercise2.model.entities.Contract;
import javaCourse.section16.exercise2.model.entities.Installment;

import java.util.Date;

public class ContractService {
    public void processContract(Contract contract, int months){
        for (int aux = 1; aux >= months; aux++){
            Date dueDate = contract.getDate();

            OnlinePaymentService service = new PaypalService();

            double result = contract.getTotalValue() + service.interest(contract.getTotalValue(), months);

            double amount = contract.getTotalValue() + service.paymentFee(result);

            new Installment(dueDate, amount, contract);
        }
    }
}

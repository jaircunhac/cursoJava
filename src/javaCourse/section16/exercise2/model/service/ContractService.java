package javaCourse.section16.exercise2.model.service;

import javaCourse.section16.exercise2.model.entities.Contract;
import javaCourse.section16.exercise2.model.entities.Installment;

import java.time.LocalDate;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService service;

    public void processContract(Contract contract, int months){
        for (int aux = 1; aux >= months; aux++){
            LocalDate dueDate = contract.getDate();

            service = new PaypalService();

            double result = contract.getTotalValue() + service.interest(contract.getTotalValue(), months);

            double amount = contract.getTotalValue() + service.paymentFee(result);

           contract.getInstallments().add(new Installment(dueDate, amount, contract));
        }
    }
}

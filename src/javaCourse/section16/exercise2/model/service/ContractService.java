package javaCourse.section16.exercise2.model.service;

import javaCourse.section16.exercise2.model.entities.Contract;
import javaCourse.section16.exercise2.model.entities.Installment;

import java.time.LocalDate;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService service;

    public void processContract(Contract contract, int months){
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <=months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = service.interest(basicQuota, i);
            double fee = service.paymentFee(basicQuota + interest);

            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }
    }

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }
}

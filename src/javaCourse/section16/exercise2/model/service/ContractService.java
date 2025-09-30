package javaCourse.section16.exercise2.model.service;

import javaCourse.section16.exercise2.model.entities.Contract;
import javaCourse.section16.exercise2.model.entities.Installment;

import java.time.LocalDate;
import java.util.Date;

public class ContractService {
    private OnlinePaymentService service;

    public void processContract(Contract contract, int months){

    }

    public ContractService(OnlinePaymentService service) {
        this.service = service;
    }
}

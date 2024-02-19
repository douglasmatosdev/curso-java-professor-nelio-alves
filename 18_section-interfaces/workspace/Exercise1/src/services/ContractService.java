package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;

public class ContractService {
    OlinePaymentService olinePaymentService;

    public ContractService(OlinePaymentService olinePaymentService) {
        this.olinePaymentService = olinePaymentService;
    }

    public void processContract(Contract contract, Integer months) {
//        contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
//        contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));

        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            LocalDate dueDate = contract.getDate().plusMonths(i);

            double interest = olinePaymentService.interest(basicQuota, i);
            double fee = olinePaymentService.paymentFee(basicQuota + interest);
            double quota = basicQuota + interest + fee;

            contract.getInstallments().add(new Installment(dueDate, quota));
        }

    }
}

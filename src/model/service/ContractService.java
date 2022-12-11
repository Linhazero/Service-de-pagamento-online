package model.service;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processcontract(Contract contract, int months) {
		
		double basicQuota = contract.getTotalValuer()/months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate duedate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuota, i);
			double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			double quota = basicQuota + interest + fee;
			contract.getInstalments().add(new Installment(duedate, quota));
		}
		
	}
}

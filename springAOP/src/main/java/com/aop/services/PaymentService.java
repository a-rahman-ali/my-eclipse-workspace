package com.aop.services;

public class PaymentService implements IPaymentService {

	@Override
	public void makePayment() {
		//

		System.out.println("Amount Debited.....");

		//
		// Some Operations
		//

		System.out.println("Amount Credited.....");

	}

}

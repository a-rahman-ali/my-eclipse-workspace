package com.aop.services;

public class PaymentServiceImpl implements PaymentService {

	@Override
	public void makePayment(int amount) {

		//
		//
		System.out.println("Amount Debited....:" + amount);

		//
		//

		// authentication to be done and, print: Payment Started
		System.out.println("Amount Credited....:" + amount);
	}

}

package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

	@Before("execution(* com.aop.services.PaymentService.makePayment())")
	public void printBefore() {
		System.out.println("Payment started....!");
	}
}

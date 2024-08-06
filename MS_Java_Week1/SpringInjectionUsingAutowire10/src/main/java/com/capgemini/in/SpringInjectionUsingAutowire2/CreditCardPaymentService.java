package com.capgemini.in.SpringInjectionUsingAutowire2;

import org.springframework.stereotype.Component;

@Component
public class CreditCardPaymentService implements PaymentService {

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Processing credit card payment of $" + amount);
	}

}

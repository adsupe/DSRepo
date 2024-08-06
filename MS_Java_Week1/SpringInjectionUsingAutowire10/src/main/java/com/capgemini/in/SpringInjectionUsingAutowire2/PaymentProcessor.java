package com.capgemini.in.SpringInjectionUsingAutowire2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class PaymentProcessor {
	private final PaymentService paymentService;

    @Autowired
    public PaymentProcessor(@Qualifier("paypalPaymentService") PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    public void process(double amount) {
        paymentService.processPayment(amount);
    }
}



package com.capgemini.in.SpringInjectionUsingAutowire2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*Create a PaymentService interface with a method processPayment.
Implement two classes, CreditCardPaymentService and PaypalPaymentService, that implement PaymentService.
Create a PaymentProcessor class that uses @Autowired to inject an instance of PaymentService.
Write a main application class to demonstrate the use of PaymentProcessor.*/
public class App 
{
    public static void main( String[] args )
    {   
    	
    	
    	ApplicationContext ac = new AnnotationConfigApplicationContext("com.capgemini.in.SpringInjectionUsingAutowire2");
    	PaymentProcessor processor = ac.getBean(PaymentProcessor.class);
    	processor.process(1000.0);
    }
}

package com.capgemini.in.constructor;

public class GreetingService {

	private MessageService messageService;
	
	
	
	public GreetingService(MessageService messageService) {
		this.messageService = messageService;
	}



	public void printMessage() {
		System.out.println("Greetings, \n "+ messageService.getMessage());
	}
}

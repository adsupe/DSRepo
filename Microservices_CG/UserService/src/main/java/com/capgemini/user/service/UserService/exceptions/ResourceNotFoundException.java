package com.capgemini.user.service.UserService.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	
	public ResourceNotFoundException()
	{
		super("resource Not Found on Server");
	}
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
}

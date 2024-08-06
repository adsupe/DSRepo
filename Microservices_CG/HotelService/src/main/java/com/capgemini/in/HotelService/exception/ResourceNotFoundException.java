package com.capgemini.in.HotelService.exception;

public class ResourceNotFoundException  extends RuntimeException {

	public ResourceNotFoundException()
	{
		super("Hotel with the given Id not on the server...pl enter an existing id");
	}
	public ResourceNotFoundException(String message)
	{
		super(message);
	}
}

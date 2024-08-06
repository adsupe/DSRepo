package com.cg.security.DefaultSecurity;

public class BookNotFoundByNameException extends RuntimeException{

	public BookNotFoundByNameException(String message) {
		super(message);
	}
}

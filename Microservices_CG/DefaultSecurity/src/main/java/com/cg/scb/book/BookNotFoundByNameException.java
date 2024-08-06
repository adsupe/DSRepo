package com.cg.scb.book;

public class BookNotFoundByNameException extends RuntimeException{

	public BookNotFoundByNameException(String message) {
		super(message);
	}
}

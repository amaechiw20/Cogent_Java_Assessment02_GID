package com.book;
/**
 * 
 * @author: William U. Amaechi
 * @date: 	Feb 1, 2023
 */
public class InvalidBookException extends RuntimeException {
	public InvalidBookException() {
		super();
	}
	
	public InvalidBookException(String errorMessage) {
		super(errorMessage);
	}

}
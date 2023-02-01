package com.lang;
/**
 * 
 * @author: William U. Amaechi
 * @date: 	Feb 1, 2023
 */
public class JavaLang extends Thread implements Language {
	
	@Override
	public synchronized void showMessage() {
		System.out.println("Java Program is running");
	}
	
	public void run() {
		showMessage();
	}

}

package com.lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author: William U. Amaechi
 * @date: 	Feb 1, 2023
 */
public class TestClient {
	private static BufferedReader user = new BufferedReader(new InputStreamReader(System.in)); //Reads User input
	public static void main (String [] args) {
		Thread java = new JavaLang();	//Java Thread
		Thread c = new CLang();		 	//C Thread
		String fav = null;				//User Input String
		int exit = 0;					//To Exit the do-while loop
		do { //Runs Until user types "java" or "c"
			System.out.print("Choose Your Favorite Programming Lang. [Java or C]: "); 
			try {
				fav = user.readLine().toLowerCase(); //User Inputs something and make all lowercase to accommodate switch statement
				switch(fav) {
				case "java": //If User put in "java" Java thread is Highest Priority
					java.setPriority(10);
					c.setPriority(9);
					exit = 1;
					break;
				case "c": //If User put in "c" C thread is Highest Priority
					c.setPriority(10);
					java.setPriority(9);
					exit = 1;
					break;
				default:	//If user doesn't type "java" or "c" print error message and goes back to loop
					System.err.println("Please choose Java or C");
				}
			} catch (IOException e) {
			}

		} while(exit != 1);
		//Once loop ends and priorities are set starts the Java and C Thread
		java.start();
		c.start();
	}

}

package com.bookutil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.book.Book;
import com.book.BookStore;
import com.book.InvalidBookException;

/**
 * 
 * @author: William U. Amaechi
 * @date: 	Feb 1, 2023
 */
public class BookUtil {
	private static BufferedReader user = new BufferedReader(new InputStreamReader(System.in));
	public static void main (String [] args) {
		//BookStore Object to Hold Books
		BookStore bookstore = new BookStore();
		do {
			try {
				System.out.println("Add 3 Books to Book Store");
				System.out.print("Book ID [ID must start with 'B' and must be of length 4 characters]: ");
				String bookID = user.readLine();
				//Book Title
				System.out.print("Title: ");
				String title = user.readLine();
				//Book Author; 
				System.out.print("Author: ");
				String author= user.readLine(); 
				//Book Category
				System.out.print("Book Category [Book Category must be \"Science\", \"Fiction\", \"Technology\" or \"Others\" \"]: ");
				String category = user.readLine();
				//Book Price
				System.out.print("Book Price [Price cannot be negative]: ");
				double price = Double.parseDouble(user.readLine());
				//Book to be added to BookStore
				Book book = new Book(bookID, title, author, category, price);
				//Adds Book to Book Store
				bookstore.addBook(book); 
				System.out.println("Book Added \n");
			} catch (InvalidBookException ivbe) { 
				System.err.println("Not a valid Book");
				ivbe.printStackTrace();
			} catch (NumberFormatException ime) { //Handles when Price is not a valid Double
				System.err.println("Input Error: Please Try Again");
			} catch (IOException e) {	//Handles when user Input is invalid
				System.err.println("Input Error: Please Try Again");
			}
		//Loops until BookStores contains 3 books
		} while (bookstore.getSize() < 3); 
			
		int exit = 0;
		do {
			System.out.println("Methods in BookStore");
			try {
				//Search for Author
				System.out.print("Search for Books by Author: ");
				String searchAuthor = user.readLine();
				bookstore.searchByAuthor(searchAuthor);
				System.out.println();
				//Search For Title
				System.out.print("Search for Books by Title: ");
				String searchTitle = user.readLine();
				bookstore.searchByTitle(searchTitle); 
				System.out.println();
				//Display All Books
				System.out.println("Display All Books");
				bookstore.displayAll();
				exit = 1;
			} catch (IOException e) {
				System.err.println("Input Error: Please Try Again");
			}
		}while(exit != 1);
	}

}

package com.book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @author: William U. Amaechi
 * @date: 	Feb 1, 2023
 */
public class BookStore {
	//BookStore HashMap to store Book Object
	private Map<String, Book> bookStore = new HashMap<String, Book>(); 
	public BookStore() {
		super();
	}
	//Adds Book to BookStore
	public void addBook(Book b) { 
		bookStore.put(b.getBookID(), b);
	}
	
	 //Search For Book in Book Store by Author
	public void searchByTitle(String title) {
		Iterator<Entry<String, Book>>booksIt = bookStore.entrySet().iterator();
		while(booksIt.hasNext()){
			Map.Entry<String, Book> book = (Map.Entry<String, Book>)booksIt.next();
			if(book.getValue().getTitle().compareTo(title) == 0) {
				System.out.println(book.getValue().toString());
			}
		}
	}
	//Search For Book in Book Store by Author
	public void searchByAuthor(String author) {	
		Iterator<Entry<String, Book>>booksIt = bookStore.entrySet().iterator();
		while(booksIt.hasNext()){
			Map.Entry<String, Book> book = (Map.Entry<String, Book>)booksIt.next();
			if(book.getValue().getTitle().compareTo(author) == 0) {
				System.out.println(book.getValue().toString());
			}
		}

	}
	//Displays All Books in Books Store
	public void displayAll() { 
		Iterator<Entry<String, Book>>booksIt = bookStore.entrySet().iterator();
		while(booksIt.hasNext()){
			Map.Entry<String, Book> book = (Map.Entry<String, Book>)booksIt.next();
			System.out.println(book.getValue().toString());
		}

	}
	
	public int getSize() {
		return bookStore.size();
	}

}

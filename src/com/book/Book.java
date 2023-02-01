package com.book;
/**
 * 
 * @author: William U. Amaechi
 * @date: 	Feb 1, 2023
 */
public class Book {
	private String bookID;
	private String title;
	private String author;
	private String category;
	private double price;

	public Book() {
		super();
	}

	public Book(String bookID, String title, String author, String category, double price) {
		super();
		//Capitalizes bookID then ThrowsInvaildBookException if bookID doesn't starts with 'B' and if 4 chars long
		String capitalBookID = capital(bookID);
		if (capitalBookID.charAt(0) == 'B') {
			if(capitalBookID.length() == 4) {
				this.bookID = capitalBookID;
			}
			else {
				throw new InvalidBookException("Book ID is not 4 characters long");
			}
		}
		else {
			throw new InvalidBookException("Book ID does not Start with the character 'B' ");
		}

		this.title = capital(title);
		this.author = capital(author);

		//ThrowsInvaildBookException if Category is not Stated in Switch
		String switchCat = capital(category); //Changes Category to Capitalized
		switch (switchCat) {
		case  "Science":
		case  "Sci":
			this.category = "Science";
			break;
		case  "Fiction":
		case  "Fict":
		case  "Fic":
			this.category = "Fiction";
			break;
		case  "Technology":
		case  "Tech":
			this.category = "Technology";
			break;
		case  "Others":
		case  "Other":
			this.category = "Others";
			break;
		default:
			throw new InvalidBookException("Book Category must be \"Science\", \"Fiction\", \"Technology\" or \"Others\" ");
		}
		//ThrowsInvaildBookException If Price is Negative
		if(price > 0) {
			this.price = price;
		}
		else {
			throw new InvalidBookException("Not a Valid Price for Book");
		}
	}

	//Getters
	public String getBookID() {
		return bookID;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getCategory() {
		return category;
	}

	public double getPrice() {
		return price;
	}
	//Setters
	public void setBookID(String bookID) {
		String capitalBookID = capital(bookID);
		if (capitalBookID.charAt(0) == 'B') {
			if(capitalBookID.length() == 4) {
				this.bookID = capitalBookID;
			}
			else {
				throw new InvalidBookException("Book ID is not 4 characters long");
			}
		}
		else {
			throw new InvalidBookException("Book ID does not Start with the character 'B' ");
		}
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setCategory(String category) {
		String switchCat = capital(category); //Changes Category to Capitalized
		switch (switchCat) {
		case  "Science":
		case  "Sci":
			this.category = "Science";
			break;
		case  "Fiction":
		case  "Fict":
		case  "Fic":
			this.category = "Fiction";
			break;
		case  "Technology":
		case  "Tech":
			this.category = "Technology";
			break;
		case  "Others":
		case  "Other":
			this.category = "Others";
			break;
		default:
			throw new InvalidBookException("Book Category must be \"Science\", \"Fiction\", \"Technology\" or \"Others\" ");
		}
	}

	public void setPrice(double price) {
		if(price > 0) {
			this.price = price;
		}
		else {
			throw new InvalidBookException("Not a Valid Price for Book");
		}
	}


	@Override
	public String toString() {
		return String.format("[Book ID: %s, Title: %s, Author Name: %s, Genre: %s, Price: %,.2f]", bookID, title, author, category, price);
	}
	
	private String capital(String str) {
		return str.substring(0, 1).toUpperCase() + str.substring(1);
	}
}

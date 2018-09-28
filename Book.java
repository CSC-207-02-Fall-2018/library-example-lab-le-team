package lib;

public class Book {
	protected String author, title, isbn;
	
	public Book() {
		author = null;
		title = null;
		isbn = null;
	}
	
	public Book(String author, String title, String isbn) {
		this.author = author;
		this.title = title;
		this.isbn = isbn;
	}
	
	public String getAuthor() {
		return author;
	}
	public String getTitle() {
		return title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String toString() {
		return "Author: " + author + ", Title: " + title + ", ISBN: " +isbn;
	}
	
	public static void main(String[] args) {
		
	}

}

package lib;
/**
 * Book class
 * @author Aidan Danbury and Chase Snodgrass
 *
 */
public class Book {
    /** Strings containing author, title, and isbn of Book */
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
	/**
	 * 
	 * @return a String author
	 */
	public String getAuthor() {
		return author;
	}
	/**
	 * 
	 * @return a String title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * 
	 * @return a String isbn
	 */
	public String getIsbn() {
		return isbn;
	}
	/**
	 * sets author field to the parameter
	 * @param String author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	/**
     * sets title field to the parameter
     * @param String title
     */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
     * sets isbn field to the parameter
     * @param String isbn
     */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	/**
	 * @return a string with the author, title, and isbn fields
	 */
	public String toString() {
		return "Author: " + author + ", Title: " + title + ", ISBN: " +isbn;
	}
	

}

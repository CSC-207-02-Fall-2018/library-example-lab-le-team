package lib;
/**
 * LibraryBook - a Book subclass
 * @author Aidan Danbury and Chase Snodgrass
 *
 */
public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {
    /** String containing callNumber*/
	protected String callNumber;
	
	public LibraryBook(String author, String title, String isbn, String callNumber) {
		super(author, title, isbn);
		this.callNumber = callNumber;
	}
	/**
	 * 
	 * @return a String callNumber
	 */
	public String getCallNumber() {
		return callNumber;
	}
	/**
	 * sets this callNumber to the String callNum
	 * @param a String callNum
	 */
	public void setCallNumber(String callNum) {
		this.callNumber = callNum;
	}
	
	public abstract void checkout(String name, String date);
	
	public abstract void returned();
	
	/** 
     *compares callNumber of this LibraryBook to that of the provided LibraryBook
     * @param book: LibraryBook object being compared
     * @return 0 if call numbers of this and book match
     *         < 0 if call number of this comes before call number of book
     *         > 0 otherwise
     */
	public int compareTo(LibraryBook book) {
	    return this.callNumber.compareTo(book.callNumber);
	}
	
	public abstract String circulationStatus();
	/**
	 * @return a String with the toString of Book with the addition of callNumber
	 */
	public String toString() {
	    return super.toString() + "\nCall Number: " + callNumber;
	}
	
}

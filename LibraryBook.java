package lib;

public abstract class LibraryBook extends Book implements Comparable<LibraryBook> {

	protected int callNumber;
	
	public LibraryBook(String author, String title, String isbn, int callNumber) {
		super(author, title, isbn);
		this.callNumber = callNumber;
	}
	public int getCallNumber() {
		return callNumber;
	}
	public void setCallNumber(int callNum) {
		this.callNumber = callNum;
	}
	public abstract void checkout(String name, String date);
	
	public abstract void returned();
	
	public int compareTo(LibraryBook book) {
		if(this.callNumber > book.callNumber) {
			return 1;
		}
		else if (this.callNumber < book.callNumber) {
			return -1;
		}
		else return 0;
	}
	
	public abstract String circulationStatus();
	
}

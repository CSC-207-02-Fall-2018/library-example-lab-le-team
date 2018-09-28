package lib;

public class CirculatingBook extends LibraryBook{
	private String currentHolder;
	private String dueDate;
	
	public CirculatingBook(String author, String title, String isbn, int callNumber) {
		super(author, title, isbn, callNumber);
		this.currentHolder = null;
		this.dueDate = null;
	}
	
	public String getCurrentHolder() {
		return currentHolder;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setCurrentHolder(String currentHolder) {
		this.currentHolder = currentHolder;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	@Override
	public void checkout(String name, String date) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void returned() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String circulationStatus() {
		// TODO Auto-generated method stub
		return null;
	}
	
}

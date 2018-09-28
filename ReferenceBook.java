package lib;

public class ReferenceBook extends LibraryBook {
	private String collection;
	public ReferenceBook(String author, String title, String isbn, int callNumber, String collection) {
		super(author, title, isbn, callNumber);
		this.collection = collection;
		
	}

	public String getCollection() {
		return collection;
	}
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	
	@Override
	public void checkout(String name, String date) {
		System.out.println("cannot check out a reference book");
		
	}
	@Override
	public void returned() {
		System.out.println("refernce book could not have been checked out -- return impossible");
		}
	
	@Override
	public String circulationStatus() {
		// TODO Auto-generated method stub
		return "non-circulating reference book";
	}
	
	public String toString() {
		return super.toString() + ", Collection: " + collection;
	}


	
}

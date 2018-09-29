package lib;

/**
 * ReferenceBook - a LibraryBook subclass
 * @author Aidan Danbury and Chase Snodgrass
 *
 */
public class ReferenceBook extends LibraryBook {
    /**String containing collection*/
	private String collection;
	public ReferenceBook(String author, String title, String isbn, String callNumber, String collection) {
		super(author, title, isbn, callNumber);
		this.collection = collection;
		
	}
	/**
	 * 
	 * @return collection: a String
	 */
	public String getCollection() {
		return collection;
	}
	/**
	 * sets this collection to parameter
	 * @param collection: a String
	 */
	public void setCollection(String collection) {
		this.collection = collection;
	}
	
	/**
	 * prints "cannot check out a reference book"
	 * @param name: a String
	 * @param date: a String
	 */
	@Override
	public void checkout(String name, String date) {
		System.out.println("cannot check out a reference book");
		
	}
	
	/**
	 * prints "reference book could not have been checked out -- return impossible"
	 */
	@Override
	public void returned() {
		System.out.println("reference book could not have been checked out -- return impossible");
		}
	
	/**
	 * @return a String: "non-circulating reference book"
	 */
	@Override
	public String circulationStatus() {
		// TODO Auto-generated method stub
		return "non-circulating reference book";
	}
	
	/**
     * @return a String containing author, title, isbn, callNumber, and collection fields
     */
	public String toString() {
		return super.toString() + ", Collection: " + collection;
	}


	
}

package lib;

/**
 * CirculatingBook - a LibraryBook subclass
 * @author Aidan Danbury and Chase Snodgrass
 *
 */
public class CirculatingBook extends LibraryBook{
    /**String containing currentHolder*/
    private String currentHolder;
    /**String containing dueDate*/
    private String dueDate;

    public CirculatingBook(String author, String title, String isbn, String callNumber) {
        super(author, title, isbn, callNumber);
        this.currentHolder = null;
        this.dueDate = null;
    }

    /**
     * 
     * @return a String currentHolder
     */
    public String getCurrentHolder() {
        return currentHolder;
    }
    /**
     * 
     * @return a String dueDate
     */
    public String getDueDate() {
        return dueDate;
    }
    /**
     * sets currentHolder field to the parameter
     * @param String currentHolder
     */
    public void setCurrentHolder(String currentHolder) {
        this.currentHolder = currentHolder;
    }
    /**
     * sets currentHolder field to the parameter
     * @param String currentHolder
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**adds parameters to the currentHolder and dueDate fields, else prints:
     * "Book already checked out"
     * @param Strings name and date
     */
    @Override
    public void checkout(String name, String date) {
        if(currentHolder == null) {
            this.currentHolder = name;
            this.dueDate = date;
        }
        else {
            System.out.println("Book already checked out");
        }
    }

    /**sets the currentHolder and dueDate fields to null
     * if they were already null, prints:
     * "This book is already in library"
     * 
     */
    @Override
    public void returned() {
        if(currentHolder != null) {
            this.currentHolder = null;
            this.dueDate = null;
        }
        else {
            System.out.println("This book is already in library");
        }
    }

    /**@return if currentHolder field is null, returns:
     * "Book available on shelves"
     * else returns a String with the currentHolder and dueDate
     */
    @Override
    public String circulationStatus() {
        if(currentHolder == null) {
            return "Book available on shelves";
        } 
        return "Current Holder: " + currentHolder + ", Due Date: " + dueDate;
    }

    /**
     * @return a String containing author, title, isbn, callNumber, currentHolder,
     * and dueDate fields
     */
    public String toString() {
        String temp = "";
        if(currentHolder != null) {
            temp = ", Current Holder: " + currentHolder + ", Due Date: " + dueDate;
        }
        return super.toString() + temp;
    }
}

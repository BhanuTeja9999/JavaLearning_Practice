
package libraryManagementSystem;

public class Book 
{
   private String title;
   private String author;
   private int ISBN;
   private boolean availabilityStatus;
   
     
     public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAuthor() {
	return author;
}

public void setAuthor(String author) {
	this.author = author;
}

public int getISBN() {
	return ISBN;
}

public void setISBN(int iSBN) {
	ISBN = iSBN;
}

public boolean isAvailabilityStatus() {
	return availabilityStatus;
}

public void setAvailabilityStatus(boolean availabilityStatus) {
	this.availabilityStatus = availabilityStatus;
}

		public Book() {
			// 0 Param
		}

	public Book(String title,String author,int ISBN)
     {
    	 this.title=title;
    	 this.author = author;
    	 this.ISBN = ISBN;
    	 this.availabilityStatus=true;
     }
     
     void markAsBorrowed()
     {
    	 this.availabilityStatus=false;
     }
     
     
     void markAsReturned()
     {
    	 this.availabilityStatus = true;
     }
     
     
     public String toString()
     {
    	 return "Book title : "+this.title+" Author :"+this.author+" ISBN :"+this.ISBN+" Availability :"+this.availabilityStatus;
     }
}

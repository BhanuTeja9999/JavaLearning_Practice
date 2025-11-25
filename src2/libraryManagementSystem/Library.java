package libraryManagementSystem;



public class Library 
{
   static Book[] book=new Book[100];
   static Member[] member=new Member[100];
   
   
public Book[] getBook() {
	return book;
}


public void setBook(Book[] book) {
	this.book = book;
}
   
public Library() {
	
}
   
   public String addBook(Book b) {
		for(int i=0;i<book.length;i++) {
			if(book[i]==null) {
				book[i]=b;
				break;
			}
		}
		return "Book Details Added Successfully";
	}

   
   public void displayAvalableBooks() {
	   for(int i=0;i<book.length;i++) {
		   if(book[i]!=null && book[i].isAvailabilityStatus()) {
			   System.out.println(book[i]);
		   }
	   }
   }
   
   
   public String borrowBook(int isbn,Member m) {
	   
	   for(int i=0;i<this.book.length;i++) {
		   if(this.book[i] != null && this.book[i].getISBN()==isbn) {
			   m.addBorrowBook(book[i]);;
			   m.setBorrowedCount(m.getBorrowedbooks().length);
			   for (int j = 0; j < member.length; j++) {
				    // First check if this slot is empty
				    if (member[j] == null) {
				        member[j] = m; // assign new member
				        break;         // stop after adding
				    } 
				    // If slot is not empty, check for duplicate ID
				    else if (member[j].getMemberID() == m.getMemberID()) {
				        System.out.println("Member ID already exists!");
				        break;
				    }
				}
			   
			   book[i].setAvailabilityStatus(false);
			   return m.getMname()+" is borrowed the book with isbn number "+isbn;
		   }
	   }
	   
	   return "Book with ISBN " + isbn + " not found!";
   }
   
   
   
}

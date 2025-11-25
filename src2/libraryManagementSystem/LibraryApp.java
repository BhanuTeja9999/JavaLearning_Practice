package libraryManagementSystem;
import java.util.Scanner;
public class LibraryApp {
 public static void main(String[] args)
 
 { 
	Scanner sc = new Scanner(System.in);
	
	while(true) {
	
	System.out.println("1.Add a book to the library\n2.Display all the available books"
			+ "\n3.Display all borrowed books\n4.Borrow a book\n5.Return a book\n6.show all the members along with books they've borrowed\n7.Exit");
	System.out.println("Enter your choice :");
	 int n = sc.nextInt();
	 
      switch(n)
      {
        case 1:{
        	System.out.println("Enter Book Title");
        	String title=sc.next();
        	
        	System.out.println("Enter Book Author");
        	String author=sc.next();
        	
        	System.out.println("Enter Book ISBN");
        	int isbn=sc.nextInt();
        	
        	Book b=new Book(title, author, isbn);
        	String result= new Library().addBook(b);
        	System.out.println(result);
        	break;
        }
        
        case 2: {
        	System.out.println("===All the available books Details===");
        	new Library().displayAvalableBooks();
        	break;
        }
        case 3:;
        case 4:{
        	new Library().displayAvalableBooks();
        	System.out.println("Enter ISBN Number of Book That you Want to Borrow...");
        	int isbn=sc.nextInt();
        	System.out.println("Enter Your Name");
        	String name=sc.next();
        	System.out.println("Enter Your Member id");
        	int id=sc.nextInt();
        	Member m=new Member(name,id);
        	String msg=new Library().borrowBook(isbn,m);
        	System.out.println(msg);
        	
        }
        case 5:;
        case 6:;
        case 7:System.exit(0);
      }
     
	 
 }
 }
}

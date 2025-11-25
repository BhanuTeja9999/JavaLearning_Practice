package libraryManagementSystem;

import java.util.Arrays;

public class Member {
   private String Mname;
   private int memberID;
   private Book []Borrowedbooks =new Book[100];
   private int borrowedCount;  
   
   
   public Member() {
	   //0 param
   }
   
   public Member(String name, int id) {
	   this.Mname=name;
	   this.memberID=id;
   }
   

   public String getMname() {
	return Mname;
}

public void setMname(String mname) {
	Mname = mname;
}

public int getMemberID() {
	return memberID;
}

public void setMemberID(int memberID) {
	this.memberID = memberID;
}


public Book[] getBorrowedbooks() {
	return Borrowedbooks;
}

public void setBorrowedbooks(Book[] borrowedbooks) {
	Borrowedbooks = borrowedbooks;
}

public int getBorrowedCount() {
	return borrowedCount;
}

public void setBorrowedCount(int borrowedCount) {
	this.borrowedCount = borrowedCount;
}

@Override
public String toString() {
	return "Member [Mname=" + Mname + ", memberID=" + memberID + ", Borrowedbooks=" + Arrays.toString(Borrowedbooks)
			+ ", borrowedCount=" + borrowedCount + "]";
}

	public void addBorrowBook(Book b) {
		for(int i=0;i<Borrowedbooks.length;i++) {
			if(Borrowedbooks[i]==null) {
				Borrowedbooks[i]=b;
			}
		}
	}

}


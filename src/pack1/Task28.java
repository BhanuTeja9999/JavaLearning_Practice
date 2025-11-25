package pack1;

import java.util.Scanner;
public class Task28 
{
	static Scanner sc = new Scanner(System.in);
	
   static void getEmployeeDetails()
   {
	   
	   System.out.println("Enter EmpName :");
	   String EmpName=sc.next();
	   System.out.println("Enter EmpID :");
	   int EmpId=sc.nextInt();
	   System.out.println("Enter EmpSal :");
	   int EmpSal=sc.nextInt();
	   System.out.println("Enter EmpAddress :");
	   sc.nextLine();
	   String EmpAddress=sc.nextLine();
	   
	   System.out.println("\n\nDetails Entered by the user:\n");
	   System.out.println("EmpName : "+EmpName);
	   System.out.println("EmpId : "+EmpId);
	   System.out.println("EmpSal : "+EmpSal);
	   System.out.println("EmpAddress : "+EmpAddress);
	   
	   
	   
   }
   public static void main(String[] args) {
	getEmployeeDetails();
}
}

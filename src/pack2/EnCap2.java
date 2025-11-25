package pack2;
import java.util.Scanner;
public class EnCap2 
{ 
   EnCap1 en=new EnCap1();
   Scanner sc = new Scanner(System.in);
  
    void empDetails()
    {
    	System.out.println("Enter the employee name :");
    	String empName = sc.nextLine();
    	en.setEmpName(empName);
    	
    	
    	System.out.println("Enter the employee Id : ");
    	int empId=Integer.parseInt(sc.nextLine());
    	en.setEmpId(empId);
    	
    	
    	System.out.println("Enter the employee Salary : ");
    	
    	int empSal=Integer.parseInt(sc.nextLine());
    	en.setEmpSal(empSal);
    	
    	
    	System.out.println("Enter the employee Experience : ");
    	int empExp=Integer.parseInt(sc.nextLine());
    	en.setEmpExp(empExp);
    	
    	System.out.println("Printing Employee Details :");
    	System.out.println("============================================");
    	
          System.out.println("Employee Name : " +en.getEmpName());
          System.out.println("Employee Id : " + en.getEmpId());
          System.out.println("Congratulations! you got "+ (en.getEmpSal()- empSal)+ " as increment" );
          System.out.println("Employee Salary : " + en.getEmpSal());
          System.out.println("Employee Experience : " +en.getEmpExp());

    	
    }
    public static void main(String[] args) {
    	
    	new EnCap2().empDetails();
	}
}

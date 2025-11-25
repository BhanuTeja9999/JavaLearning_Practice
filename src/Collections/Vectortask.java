package Collections;
import java.util.Vector;
import java.util.ArrayList;
//import java.util.Iterator;

public class Vectortask
{
  Vector<Employee> meth1(ArrayList<Object> al)
  {
	 Vector<Object> v1 = new Vector<Object>(al);
	 System.out.println(v1);
	 System.out.println("----------------");
	 Vector<Employee> Employees = new Vector<Employee>();
	 Employees.add(new Employee("Bhanu",1034,"Oracle"));
	 Employees.add(new Employee("Suvarna",1023,"Java"));
	 Employees.add(new Employee("nayan",1234,".NET"));
	 Employees.add(new Employee("Hari",1043,"SAP"));
	 Employees.add(new Employee("liril",1612,"Python"));
	 Employees.add(new Employee("nitin",1323,"Scala"));
	 
	 
	 return Employees;
  }
  public static void main(String[] args)
  {
	 System.out.println("-- program started --");
	  Vectortask vt=new Vectortask();
	  ArrayList<Object> Al = new ArrayList<Object>();
	  Al.add("Orange");
	  Al.add("JackFruit");
	  Al.add("Grapes");
	  Al.add("Raspberry");
	  Al.add("regikaya");
	  
	  Vector<Employee> result = vt.meth1(Al);
	  int count=0;
	  for(Employee e : result)
	  {
		  String name = e.getEmpName();
		  String reversed = new StringBuffer(name).reverse().toString();

		  if(name.equalsIgnoreCase(reversed))
		  {
		      count++;
		      System.out.println(name);
		  }
	  }
	  System.out.println("No of palindrome names : "+count);
  }
}

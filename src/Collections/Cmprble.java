package Collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Cmprble
{
   void meth1()
   {
	   System.out.println("Implementing Sorting\n");
	   ArrayList<Employee> al = new ArrayList<Employee>();
	   Employee emp1 = new Employee("Raju",40000,"Java");
	   Employee emp2 = new Employee("Ahmed",30000,"Oracle");
	   Employee emp3 = new Employee("Kishan",50000,"AWS");

       al.add(emp1);
       al.add(emp2);
       al.add(emp3);
       System.out.println("Before sorting : ");
       Iterator<Employee> i = al.iterator();
       while(i.hasNext())
       {
    	   System.out.println(i.next());
       }
       System.out.println("\nAfter sorting :");
	   Collections.sort(al);
	   Iterator<Employee> i2 = al.iterator();
       while(i2.hasNext())
       {
    	   System.out.println(i2.next());
       }
       System.out.println(i2);
       System.out.println(i2.hashCode());
   }
   public static void main(String[] args) {
	new Cmprble().meth1();
}
}

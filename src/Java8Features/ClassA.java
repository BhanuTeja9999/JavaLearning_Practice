package Java8Features;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class ClassA 
{
   void display()
   {
	   InterfaceA a = (x ,al)->{
		   System.out.println("Implementing Interface A");
            
		  System.out.println("The number is : "+x);
		  System.out.println("ArrayList :  "+al);
	   };
	   ArrayList<String>  al = new ArrayList<String>();
	   al.add("Santosh");
	   al.add("Bhanu");
	   a.meth1(78, al);
	   a.wish();
	   System.out.println("-------------------");
	   
	   
	   InterfaceB b =(u,v,w )->
	   {
		   System.out.println("Implementing Interface b");

		   System.out.print("u: "+u+" String :"+v+" character :"+w+"\n");
		   return "Bhanu";
	   };
	   b.meth2(34, "Java", 'b');
	   
	   System.out.println("-------------------");

	   InterfaceC c =(t,z)->
	   {
		   System.out.println("Implementing Interface c");

		 System.out.println("t value :"+t);
		 System.out.println("x value :"+z.getX());
		 System.out.println("y value :"+z.getY());
		 
	   };
	   ClassB bobj=new ClassB(30,50);
	   c.meth3(6,bobj);
	   
	   System.out.println("-------------------");

	   
	   InterfaceD d =(m,Al)->{
		   System.out.println("Implementing Interface D");
		   System.out.println(m);
		   System.out.println(Al);
	   };
	   HashMap<Integer,String> hm = new HashMap<Integer,String>();
	   hm.put(1,"Core Java");
	   hm.put(2,"Oracle");
	   hm.put(3,"HTML");
	   hm.put(4,"JDBC");
	   d.meth4(hm, al);
	   System.out.println("-------------------");

	   InterfaceE e =(array,treeset)->{
		   System.out.println("Implementing Interface E");
		   System.out.println("Array elements : ");
		   for(int ele:array)
		   {
			   System.out.print(ele + " ");
		   }
		   System.out.println("\nTreeSet elements :");
		   for(Object o :treeset)
		   {
			   System.out.print(o + " ");
		   }
		   return new int[] {1,2,3,4,5};
	   };
	   
	   TreeSet<Integer> ts = new TreeSet<Integer>();
	   ts.add(11);
	   ts.add(34);
	   ts.add(-67);
	   ts.add(0);
	   ts.add(77);
	   int arr[]= {34,76,89,07};
	   e.meth5(arr, ts);
   }  
		  
   public static void main(String[] args) {
	new ClassA().display();
	
	
}
}

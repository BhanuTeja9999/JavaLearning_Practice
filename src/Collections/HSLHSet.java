package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HSLHSet 
{
   void meth1()
   {
	   System.out.println("Implementing Set interface : \n");
	   LinkedHashSet<Object> hs = new LinkedHashSet<Object>(); //Insertion order is  maintained

	   //HashSet<Object> hs = new HashSet<Object>(); //Insertion order is NOT maintained
	   hs.add(10);
	   hs.add("Java");
	   hs.add(null);
	   hs.add('A');
	   hs.add(true);
	   hs.add(88);
	   hs.add(5.5);
	   
	   hs.add(10);//duplicates are not allowed.But no error or exception
	   
	   System.out.println(hs);
	   System.out.println("\nsize() : "+hs.size());
	   
	   System.out.println("Retrieving the elements using for Each loop");
       for(Object o : hs)
       {
    	   System.out.print(o + " ");
       }
       //System.out.println(hs.get(0));//Set will not maintain index positions.
       
	   System.out.println("\nRetrieving the elements using Iterator Interface");
	    Iterator<Object> it = hs.iterator();
	    while(it.hasNext())
	    	System.out.print(it.next() + " ");
	   
	   System.out.println("\nRetrieving the elements using ListIterator Interface in backward direction");
	   /*
	    * ListIterator is present in 'List Interface'
	    * It is not there in set
	    * So pass this HashSet into ArrayList so that 
	    * you can access the listIterator() method
	    */
	   ArrayList<Object> al =new ArrayList<Object>(hs);
	   ListIterator<Object> LI=al.listIterator(hs.size());
	   while(LI.hasPrevious())
	   {
		   System.out.println(LI.previous());
	   }

       ArrayList<String> names = new ArrayList<String>();
       names.add("Java");
       names.add("Java");
       names.add("Java");
       names.add("Python");
       names.add("Perl");
       HashSet<String> hs1 = new HashSet<String>(names);
       System.out.println("\n\nArrayList data : "+names + "("+names.size()+")");
       System.out.println("HashSet data : "+hs1 + "("+hs1.size()+")");

   }
   public static void main(String[] args) 
   {
	new HSLHSet().meth1();
   }
}

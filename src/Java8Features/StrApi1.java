package Java8Features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StrApi1 
{
   void meth1()
   {
	   IO.println("meth1() called");
	   ArrayList<Integer> al = new ArrayList<Integer>();
	   al.add(10);
	   al.add(30);
	   al.add(50);
	   al.add(20);
	   al.add(40);
	   IO.println("Retrieving the data by using iterator\n");
	   Iterator<Integer> i = al.iterator();
	   while(i.hasNext())
	   {
		   IO.println(i.next() + " ");
	   }
	   IO.println("\nRetrieving the data using forEach() ");
	   al.forEach(d->System.out.print(d + " "));
   }
   public static void main(String[] args) {
	new StrApi1().meth1();
}
}

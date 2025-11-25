package Collections;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Vector;

public class LinkedListImp
{
  void meth1()
  {
	  System.out.println("Implementing Linked List");
	  LinkedList<Object> ll = new LinkedList<Object>();
	  
	  ll.add(10);//Insertion order is maintained
	  ll.add("Java");//Heterogeneous data is allowed
	  ll.add(null);//null values are allowed
      ll.add(10);//duplicates are allowed	
      ll.add('A');//It is available from Java 1.2v
      ll.add(true);//Its default capacity is 0
      ll.add(1);//Its size increases by one[one by one node]
      ll.add(99);
      System.out.println(ll);
      System.out.println("\nsize(): "+ll.size());
      System.out.println("get() "+ll.get(1));
      /*
       * ListIterator is used to retrieve the data in both forward and backward directions
       */
      System.out.println("\nRetrieving the data by using ListIterator in forward direction");
      ListIterator<Object> li1 = ll.listIterator();
      while(li1.hasNext())
      {
    	  System.out.print(li1.next()+" ");
      }
      System.out.println("\n-------------");
      System.out.println("Retrieving the data by using ListIterator in backward direction");
      ListIterator<Object> li2 = ll.listIterator(ll.size());
      while(li2.hasPrevious())
      {
    	  System.out.print(li2.previous()+" ");
      }
      
      System.out.println("\nLinked List : "+ll);
      System.out.println("ArrayList :"+new ArrayList(ll));
      
      System.out.println("Vector : "+new Vector<Object>(ll));
      System.out.println("\ngetFirst() : "+ll.getFirst());
      System.out.println("\ngetLast() : "+ll.getLast());
     
  }
  public static void main(String[] args) {
	new LinkedListImp().meth1();
}
}

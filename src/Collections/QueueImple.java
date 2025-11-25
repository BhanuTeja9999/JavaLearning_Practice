package Collections;
import java.util.LinkedList;
import java.util.List;

public class QueueImple
{
  void meth1()
  {
	  System.out.println("Meth1() called");
	  List<Object> li = new LinkedList<Object>();
	  li.add(10);
	  //li.offer(20); //Error offer method is not present in List Interface
	  
	  LinkedList<Object>ll = new LinkedList<Object>();
	  ll.add(11);
	  ll.add("Hello");
	  ll.add(21);
	  
	  System.out.println("peek() method : "+ll.peek());
	  System.out.println(ll);
	  System.out.println("poll method : "+ ll.poll());//Retrieves and removes the head (first element) of this lis
	  System.out.println(ll);
	  ll.offer(78); //Adds the specified element as the tail (last element) of this list.
	  System.out.println(ll);
	  ll.offerFirst("Bhanu");//Inserts the specified element at the front of this list
	  System.out.println(ll);
	  ll.offerLast("Teja");//Inserts the specified element at the end of this list
	  System.out.println(ll);
      System.out.println("peekFirst() : "+ll.peekFirst());
      System.out.println("peekLast() : "+ll.peekLast());
      System.out.println(ll.lastIndexOf(21));
      System.out.println(ll.removeFirstOccurrence("bhanu"));
  }
  public static void main(String[] args) {
	new QueueImple().meth1();
}
}

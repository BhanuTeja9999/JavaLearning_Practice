package Collections;
import java.util.TreeSet;
import java.util.Iterator;


public class TreeSetHw2 
{
  public static void main(String[] args) 
  {
	TreeSet<String> fruits = new TreeSet<String>();
	
	fruits.add("apple");
	fruits.add("banana");
	fruits.add("Cherry");
	fruits.add("dates");
	fruits.add("elderberry");
	
	System.out.println("Elements in Descending order");
	Iterator<String> itr = fruits.descendingIterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
  }    
}

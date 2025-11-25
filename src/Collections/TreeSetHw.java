package Collections;
import java.util.TreeSet;

public class TreeSetHw 
{
  public static void main(String[] args)
  {
	  TreeSet<Integer> numbers = new TreeSet<Integer>();
	  numbers.add(10);
	  numbers.add(5);
	  numbers.add(30);
	  numbers.add(20);
	  numbers.add(25);
	  
	  System.out.println("Elements in Ascending Order : "+numbers);
  }
}

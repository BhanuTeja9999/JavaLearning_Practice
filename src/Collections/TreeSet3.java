package Collections;
import java.util.TreeSet;
import java.util.Iterator;
/*
 * Copying elements from one treeSet into another
 */
public class TreeSet3 
{
  public static void main(String[] args)
  {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(43);
	ts.add(67); //Heterogenous data is not allowed
	ts.add(34);
	ts.add(87);
	
	TreeSet<Integer> ts2 = new TreeSet<Integer>();
	
	System.out.println("Ts : "+ts);

	Iterator<Integer> i = ts.iterator();
	while(i.hasNext())
	{
		int k =i.next();
		ts2.add(k);
	}
	System.out.println("Ts2 : "+ts2);
  }
}

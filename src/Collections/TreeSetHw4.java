package Collections;
import java.util.TreeSet;
import java.util.Iterator;
public class TreeSetHw4 
{
  public static void main(String[] args) 
  {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(99);
	ts.add(-76);
	ts.add(0);
	ts.add(34);
    
	int array[]= new int[ts.size()];
	int index = 0;
	Iterator<Integer> i = ts.iterator();
    while(i.hasNext())
    {
    	array[index]=i.next();
    	index++;
    }
    
     for(int i2 =0;i2<array.length;i2++)
    	 System.out.print(array[i2]+ " ");
  }
}

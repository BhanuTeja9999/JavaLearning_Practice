package Collections;
import java.util.ArrayList;
import java.util.TreeSet;

public class TreeSetHw5
{
  public static void main(String[] args) {
	TreeSet<Integer> ts = new TreeSet<Integer>();
	ts.add(23);
	ts.add(98);
	ts.add(37);
	ts.add(11);
	ts.add(65);
    
	ArrayList<Integer> al = new ArrayList<Integer>(ts);
    System.out.println("ArrayList :  "+al);
    System.out.println("Highest element : "+al.get(al.size()-1));
    System.out.println("Lowest element : "+al.get(0));
}
}

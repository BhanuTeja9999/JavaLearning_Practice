package Collections;


import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorImple 
{
  void meth1()
  {
	  System.out.println("Implementing Vector List\n");
	  Vector<Object> v = new Vector<Object>();
	  v.add(10);//Insertion order is maintained
	  v.add("Java");//heterogeneous data is allowed
	  v.add(null);//Null values are allowed
	  v.add(10);//Duplicates are allowed
	  v.add(1); //It is available from Java 1.0v(It is a legacy class)
	  v.add('A'); //Its default capacity is 10
	  v.add(true);//Its size increases by double
	  v.add(99);//It is synchronized
	  
	  System.out.println(v);
	  System.out.println("\nCapacity() "+ v.capacity());
	  System.out.println("\nSize() : "+v.size());
	  v.add(v.size()-1,100);
//	  System.out.println(v);
	  System.out.println("Retrieving the data by using for loop");
	  for(int i =0;i<=v.size()-1;i++)
		  System.out.print(v.get(i)+ " ");
	  
	  System.out.println("Retrieving the data using Enumeration Interface : \n");
	  Enumeration <Object> e = v.elements();//vector ref.elements()
	  while(e.hasMoreElements())
	  {
		  System.out.print(e.nextElement()+ " , ");
	  }
	  
	  //How to add all the elements in the vector into ArrayList 
	  
	  //1st Approach(best)
	  ArrayList<Object> al = new ArrayList<Object>(v);
	  
	  //2nd Approach
	  //al.addAll(v);
	  
	  //3rd Apporach
	/* for(int x=0;x<v.size()-1;x++)
	  {
		  al.add(v.get(x));
	  }
	  */
	  //4th Approach
	  /*for(Object o : v)
	  {
		  al.add(o);
	  }
	  */
    }
  public static void main(String[] args) {
	new VectorImple().meth1();
}
}

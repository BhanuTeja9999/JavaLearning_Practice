package Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Arrlst3 
{
   void meth1()
   {
	   ArrayList<Integer> a = new ArrayList<Integer>();
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter some values:\n");
	   for(int i =1;i<=10;i++)
	   {
          a.add(Integer.parseInt(sc.nextLine()));		 
	   }
	   System.out.println("Insertion completed\n");
	   System.out.println("Removing even elements..........");
	   /*
	   for(int i =1;i<a.size();i++)
	   {
		   Integer element=a.get(i);
		   if(element%2==0)
		     {
          //int element = a.get(i);
		    	 a.remove(element);
		     }
		   
	   }//giving IndexOutOfBoundsException
	   */
	   
	    Iterator<Integer>i=a.iterator();
	    //System.out.println("printing the Iterator ref variable i: "+i.toString());
	    while(i.hasNext())
	    {
	    	int element=i.next();
	    	System.out.println(element);
	    	if(element%2==0)
	    	{
	    	  System.out.println("Removing element :"+element);
	    	  
	    	  i.remove();
	    	  System.out.println("Removed");
	    	  
	    	}
	    	//;
	    }
	     
	   System.out.println("Remaining elements : "+a);
	   
	   sc.close();
   }
   public static void main(String[] args)
   {
	 new Arrlst3().meth1();
   }
}

package Java8Features;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.TreeSet;

public class MethrefA 
{
   void display()
   {
	   System.out.println("Implementing Lambda Expressions \n");
	   Intmethref x = new MethrefC() :: show; //Method reference
	   int input1 = 99;
	   MethrefB input2=new MethrefB();
	   ArrayList<Integer> input3 = new ArrayList<Integer>();
	   input3.add(10);
	   input3.add(20);
	   input3.add(30);
	   
	   
	  LinkedHashMap<Object,Object> result= x.meth1(input1,input2,input3);
	   TreeSet<Object> set = new TreeSet<Object>(result.keySet());
	   Iterator<Object> i = set.descendingIterator();
	   while(i.hasNext())
	   {
		   Object o = i.next();
		   System.out.println(o + " <==> "+result.get(o));
	   }
	   
   }
   public static void main(String[] args)
   {
	MethrefA aobj = new MethrefA();
	aobj.display();
   }
}

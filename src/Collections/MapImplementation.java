package Collections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapImplementation
{
   void meth1()
   {
	   System.out.println("Implementing Map interface \n");
//	   HashMap<Object,Object> map = new HashMap<Object,Object>(); //HashMap doesn't maintain insertion order
	   LinkedHashMap<Object,Object>map = new LinkedHashMap<Object,Object>();
	   map.put(101, "Java");
	   map.put("Java", "Java");//Heterogeneous values & Homogeneous value are allowed
	   map.put(null, null);//null keys and values are allowed
	   map.put(104, "Spring"); //Duplicate values are allowed
	   map.put("Html", 1000);
	   map.put(106, true);
	   map.put("Html",434); //If you are trying to insert a duplicate key with duplicate value or different value it will replace the existing entry having duplicate key
	   System.out.println("Entries in the map :\n "+map);
	   map.put("CSS","Styling");//Its default capacity is 16
	   map.put("Bootstrap","Framework");
	   
	   ArrayList<Object> al = new ArrayList<Object>(map.keySet());
	   LinkedHashSet<Object> lhs = new LinkedHashSet<Object>(map.keySet());

	   System.out.println(" Keys in AL keySet() : "+al);
	   System.out.println("values() :"+map.values());
	   System.out.println("Keys in LinkedHashSet : "+lhs);	
	   System.out.println("----------");
	   System.out.println("Retrieving the Entries from map using keys in ArrayList(al) map.get(): ");
	   for(Object o : al)
		   System.out.println(o+ "-"+map.get(o));
	   System.out.println("------------------");
	   System.out.println("Retrieving BOTH key-value pairs by using entrySet()");
	   LinkedList<Object> ll = new LinkedList<Object>(map.entrySet());
	   Iterator<Object> i =ll.iterator();
	   
	   while(i.hasNext())
	   {
		   Entry<Object,Object> e = (Entry<Object, Object>) i.next();
		   System.out.println(e.getKey()+" "+e.getValue());
		   
	   }
	   
	 
   }
   void meth2()
   {
	   System.out.println("Implementing TreeMap");
	   TreeMap<Object,Object> tm = new TreeMap<Object,Object>();
	   tm.put(101, "Java");
	   tm.put(104, null);
	   tm.put(103, "Spring");
	   tm.put(105,1000);
	   tm.put(106, true);
	   tm.put(108,2000);
	   tm.put(102, "css");
	   //tm.put("India", 89); classcastException
	   System.out.println(tm);
	   //Passing keyset of tree map into treeset
	   TreeSet<Object> ts = new TreeSet<Object>(tm.keySet());
	   //Retrieving the values using Keys stored in  treeset  and descending iterator() of treeset from the tree map  
	   Iterator<Object> i1 = ts.descendingIterator();
	   while(i1.hasNext())
	   {
		   Object o = i1.next();
		   System.out.println(o+ " "+tm.get(o));
	   }
	   
   }
   public static void main(String[] args)
   {
	MapImplementation mip=new MapImplementation();
	mip.meth2();
   }
}

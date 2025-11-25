package Java8Features;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class MethrefC {
  LinkedHashMap <Object ,Object> show(int a ,MethrefB b,ArrayList<Integer> al)
  {
	 System.out.println("Parameter 1 : "+a);
	 System.out.println("parameter 2 : "+b);
	 System.out.println("parameter 3 : "+ al +"\n");
	 LinkedHashMap<Object,Object> map = new LinkedHashMap<Object,Object>();
	 map.put(101,"Java");
	 map.put(103, "Spring");
	 map.put(102, "Oracle");
	 map.put(105, "HTML");
	 map.put(104, "React");
	 return map;
	 
 }
}

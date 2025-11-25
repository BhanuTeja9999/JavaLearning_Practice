package generictest01;

public class StringTest
{
   int a = 10;
  
   void meth1()
   {
	//   String s="Java";
	  //char arr[]= {'j','a','v','a'};
	   //System.out.println(arr.length);
      //String s1 = new String(arr,1,2);
      //System.out.println(s1);
	 
	   //System.out.println(s.hashCode());
	   //System.out.println(s1.hashCode());
   }
   public static void main(String[] args) 
   {
	StringTest st= new StringTest();
	  System.out.println(st.a);
	StringTest st2 = new StringTest();
	st2.a =11;
	System.out.println(st.a++);
	System.out.println(st2.a);
	System.out.println(st.a);
	System.out.println(Integer.MAX_VALUE);
	  
	
   }
	/*
	 * static { System.out.println("Hello Prudhvi"); }
	 */
}

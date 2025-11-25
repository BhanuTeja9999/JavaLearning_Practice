package pack2;


public class StringIntro
{
   void meth1()
   {
	   System.out.println("meth1() called\n");
	   String s1="Java";
	   String s2=new String("Java");
	   char arr[]= {'J','a','v','a'};
	   String s3= new String(arr);
	   String s4= new String(arr,1,2);
	   
	   System.out.println("s1 : "+s1);
	   System.out.println("s2 : "+s2);
	   System.out.println("s3 : "+s3);
	   System.out.println("s4 : "+s4);//av
   }

   void meth2()
   {
	 System.out.println("meth2() called\n ");
	 String s = "Java";
	 System.out.println("Strings which are created using String class are immutable");
	 System.out.println("Before concatenation s :"+s);
	 // System.out.println(s.concat(" is awesome"));
	 s=s.concat(" is awesome");
	 System.out.println("After concatenation : "+s);
   }
   public static void main(String[] args) {
	StringIntro si=new StringIntro();
	si.meth1();
	si.meth2();
   }
	
}

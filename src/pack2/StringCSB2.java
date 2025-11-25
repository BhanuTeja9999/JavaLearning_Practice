package pack2;

public class StringCSB2 
{
	void meth1()
	{
		System.out.println("meth1() called");
		String s= new String("Java");
		StringBuffer buffer= new StringBuffer("Java");
		StringBuilder builder = new StringBuilder("Java");
		
		System.out.println("-----------Before----------");
		System.out.println("String class : "+ s);
		System.out.println("StringBuffer Class : "+buffer);
		System.out.println("StringBuilder Class : "+builder);
;
		
		s.concat(" is awesome");
		buffer.append(" is awesome");
		builder.append(" is awesome");
		
		
		System.out.println("\n-------After---------");
		System.out.println("String Class : "+s);
		System.out.println("StringBuffer Class : "+buffer);
		System.out.println("StringBuilder Class : "+builder);
		
		/*
		 * String objects created using String class are immutable
		 * String objects created using StringBuilder and StringBuffer classes
		 * are mutable
		 */	
	}
	void meth2()
	{
		System.out.println("meth2() called ");
		String s1 = new String("Java");
		StringBuffer buffer1 = new StringBuffer("Java");
		StringBuilder builder1 = new StringBuilder("Java");
		
		String s2 = new String("Java");
		StringBuffer buffer2 = new StringBuffer("Java");
		StringBuilder builder2 = new StringBuilder("Java");
	//	builder2.
		
		//System.out.println();
		
	}
   public static void main(String[] args)
   {
         //new StringCSB2().meth1();	
   }
}

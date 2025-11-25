package pack1;

public class StaticKeyword3 
{
   final static int x = 50;
   final static int y;
   static
   {
	   System.out.println("1st static block called");
	   y = 100;
	   System.out.println("x: "+x);
	   System.out.println("y: "+y);
	   
   }
   public static void main(String[] args) {
	System.out.println("\nMain() called");
	System.out.println("x: "+x);
	System.out.println("y: "+y);
}
   static
   {
	   System.out.println("\n2nd static block called");
	 //  y = 500; //compile time error
	   /* Here we already initialized variable y in 1st static block .Again initialization is not possible in another static block*/
	   System.out.println("x: "+x);
	   System.out.println("y: "+y);
   }
}

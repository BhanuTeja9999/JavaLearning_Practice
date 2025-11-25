package pack2;

public class Exce1 extends Object
{
   void meth1()
   {
	   System.out.println(10);
	   try
	   {
		   System.out.println("try block executed");
		   System.out.println(20/0);
	   }
	   catch(Exception e)
	   {
		   System.out.println("Catch block executed");
		   System.out.println(e.toString());//Name & reason of the Exception
		   //System.out.println(e.getMessage());//Reason of the exception
		   //e.printStackTrace();
	   }
	   
	   finally
	   {
		   System.out.println("finally block executed");
	   }
	   System.out.println(30);
   }
   
  public String toString()
    {
	   return "Success";
   }
   
   public static void main(String[] args) {
	  Exce1 e = new Exce1();
	  System.out.println(e.toString());
   }
   
}

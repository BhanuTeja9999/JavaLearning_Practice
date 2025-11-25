package pack1;

public class Variables 
{
   int x =10;//Instance Variable (or) Non-static(or) Global Variables
   static int y = 20;
   boolean flag;
   static int a;
   
   /* static byte x =11;
    * static int x =22;
    * String y = "Java";//Compile Time Error .Instance variables and static variables cannot have same 
    *                   //identifier irrespective of their datatypes
    * int y = 33;
    */
   
   double X = 10.9; //No error because Java is case sensitive
   void meth1()
   {   
	   
	   System.out.println("Meth1() called");
	   int z = 30;//local variable
	 //Accessing Instance Variables in 2 ways
	   System.out.println("\nInstance Variable x: "+x);//by using identifier
	   System.out.println("\nInstance Variable x:"+new Variables().x);//by using respective class object
	   
	   //Accessing  Static variables in 3 ways
	   System.out.println("\nStatic Variable: "+y);//by using identifier
	   System.out.println("\nStatic Variable y:"+new Variables().y);//by using respective class object
	   System.out.println("\nStatic Variable: "+Variables.y);//by using className
	   System.out.println("Local variable z :"+z);
   }
   
   void meth2()
   {
	   System.out.println("\nMeth2() called");
	   int x =111;
	   int y = 222;
	   System.out.println("Instance variable: "+new Variables().x);
	   System.out.println("Static Variable: "+Variables.y);
	  // System.out.println("Local Variable: "+z);//C.e BECOZ 'z' belongs to meth1()
	   System.out.println("Local Variables x: "+x +" y: "+ y);
   }
   
   void meth3()
   {
	   char c;
	   System.out.println("meth3() called");
	   System.out.println("Instance Variable flag:"+flag);
	   System.out.println("Static Variable a: "+a);
	   //System.out.println("Local variable c:"+c);//compile time error 
	   
   }
   
   public static void main(String[] args) 
   {
	Variables vs = new Variables();
	vs.meth1();
	vs.meth2();
	vs.meth3();
   }
}

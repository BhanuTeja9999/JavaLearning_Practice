package pack1;

public class StaticKeyword2
{
  int x =10;//Instance variable
  static int y = 20;//static variable (or) Class Variable
  void meth1() //Non-static (or) Instance (or) Concrete (or) Normal
  {
	  System.out.println("meth1() called");
	  System.out.println("Instance variable x: "+x);//Accessing instance variable in an instance method.becoz it belongs to one particular object
	  System.out.println("Static variable y: "+y);//
	  System.out.println("-------------------------------");
  }
  static void meth2()//static method
  { 
	  System.out.println("meth2() called");
	  System.out.println("Instance variable x: "+new StaticKeyword2().x);
	  System.out.println("Static variable y: "+y);
	  System.out.println("-------------------------------");
	
	  
  }
  public static void main(String[] args) {
	  
	  StaticKeyword2 sk = new StaticKeyword2();
	  sk.meth1();
	  sk.meth2();//by using ClassObject
	  meth2();//by using Identifier 
	  StaticKeyword2.meth2();//by using ClasName ****************
			  
	  
}
}

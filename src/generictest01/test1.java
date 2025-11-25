package generictest01;

public class test1
{
  int meth1()
  {
	  System.out.println("hi");  
	  return new test1().meth2();
  }
  int meth2()
  {
	  return 5;
  }
  public static void main(String [] args)
  { 
	 test1 t=new test1();
	 System.out.println("x value :"+t.meth1());
  } 
}
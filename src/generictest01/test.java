package generictest01;

public class test
{
   void meth1()
   {
	   System.out.println(20/0);
   }
   public static void main(String[] args) {
	new test().meth1();
}
}

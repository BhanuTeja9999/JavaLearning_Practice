package pack1;
import java.util.Scanner;
public class Task27 
{
   static Scanner sc = new Scanner(System.in);
   
   int meth1(int a,String data)
   {
	   System.out.println("--------meth1() called---------");
	   System.out.println("a value :"+ a);
	   System.out.println("data value :" + data);
	   return 1;
   }
   String meth2(int x,int y)
   {
	   System.out.println("-----meth2() called-----");
	   System.out.println("x value : "+x);
	   System.out.println("y value : "+ y);
	   sc.nextLine();
	   String s = sc.nextLine();
	   return s;
   }
   int meth3(int i)
   {
	  System.out.println("--------meth3() called---------");
	  System.out.println("i value : "+ i);
	  System.out.println("Enter the number: ");
	  int val=sc.nextInt();
	  return val;
   }
   public static void main(String[] args) {
	   Task27 t = new Task27();
	   System.out.println("Enter first int value :");
	   int a = sc.nextInt();
	   System.out.println("Enter second int value :");
	   int b = sc.nextInt();
	   System.out.println("Enter third int value :");
	   int c = sc.nextInt();
	   int x= t.meth1(t.meth3(a), t.meth2(b,c));
	   System.out.println("Value returned by meth1() :"+x);
}
}

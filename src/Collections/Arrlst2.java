package Collections;
import java.util.ArrayList;
import java.util.Scanner;
public class Arrlst2
{
   void meth1()
   {
	   ArrayList<String> str = new ArrayList<String>();
	   System.out.println("Enter 5 strings :\n");
	   int i =5;
	   Scanner sc = new Scanner(System.in);
	   while(i>=1)
	   {   System.out.print("Enter String "+i);
		   str.add(sc.next());
		   i--;
	   }
	   
	   
   }
   public static void main(String[] args) {
	new Arrlst2().meth1();
}
}

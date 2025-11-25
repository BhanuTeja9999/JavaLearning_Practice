package pack2;
import java.util.Scanner;
public class Array2 
{
  void meth1()
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your id : ");
	  Integer.parseInt(sc.nextLine());
	  
	  System.out.println("Implementation of array");
	  int arr[] = new int [] {1,2,3,4,5,6,7};
	  System.out.println("Retrieving elements from the array using for-loop ");
	  for(int i =0;i<=arr.length-1;i++)
	  {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println("\nRetrieving elements from the array in backward direction");
	  for(int i=arr.length-1;i>=0;i--)
	  {
		  System.out.print(arr[i]+" ");
	  }
	  System.out.println("\nRetrieving elements from the array in FOR-EACH LOOP (in forward direction only)");

	  for(int z:arr)
	  {
		  System.out.print(z+" ");
	  }
  }
  
  void meth2()
  {
	  System.out.println("meth2() called");
	  String names[]=new String[0];//size 0 is valid
	  //But we cannot assign values becoz there are no index positions available
	  System.out.println("\nlength of names String array :"+names.length);
	  boolean flag[]=new boolean[-5];
	  System.out.println("length of flag");
	  
	  
  }
  public static void main(String[] args) {
	new Array2().meth1();
	new Array2().meth2();
}
  
}

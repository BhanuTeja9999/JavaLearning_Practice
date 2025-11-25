package pack2;
import java.util.Arrays;
public class Array1 {

   void meth1()
   {
	   System.out.println("Implementing Java Array\n");
	   int  arr1[];
	   arr1 = new int[5];
	   int arr2[]=new int[] {1,2,3,4,5,6};//imp
	   int arr3[] = {9,8,7,6,5,4};
	   
	  
	   System.out.println("arr1 length :"+arr1.length);
	   System.out.println("arr2 length :"+arr2.length);
	   System.out.println("arr3 length : "+ arr3.length);
	   String s = "Bhanu";
	   System.out.println("length of "+s+" is :"+s.length());
	   System.out.println("arr1 : "+arr1);//Prints Implementation of toString() becoz arr1 is an object
	   System.out.println("arr2 : "+arr2.toString());
	   System.out.println("arr2 : "+arr2);
	   System.out.println("arr3 : "+arr3);
	   
	   System.out.println("arr1 : "+Arrays.toString(arr1));
	   System.out.println("arr2 : "+Arrays.toString(arr2));
	   System.out.println("arr3 : "+Arrays.toString(arr3));
	   
	   /* Index Positions are used to pass the values into the array .
	    * and to retrieve the values back cfrom the array
	    */
	   
   }
    
   public static void main(String[] args) {
	new Array1().meth1();
}
}

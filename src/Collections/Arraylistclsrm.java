package Collections;
import java.util.ArrayList;
public class Arraylistclsrm 
{
   ArrayList<Student>meth1(ArrayList<String>al1,boolean arr[],ArrayList<Integer> al2)
   {
	   //Task1 : Print all the elements which are present in al1 in a reverse order
	   for(int i = al1.size()-1;i>=0;i--)
		   System.out.print(al1.get(i)+ " ");
	   System.out.println();
	   for(boolean b : arr)
		   System.out.print(b + " ");
	   ArrayList<Integer> a = new ArrayList<Integer>();
	   for(int i=al2.size()-1;i>=0;i--)
	   {
		   a.add(al2.get(i));
	   }
	   System.out.println("\nReversed linked list : "+a);
	   
	   //Return type of this method is ArrayList so we need to return
	   //an arraylist
	   //Anduke oka arraylist create chesi
	   //Student Objects pass chestunnam
	   //Endukante akkada generic Student kabatti
	   //It will accept only student objects kabatti
	   ArrayList<Student> stu = new ArrayList<Student>();
	   stu.add(new Student("Krishna",100,"Btech"));
	   stu.add(new Student("SriRam",90,"MTech"));
	   stu.add(new Student("siva",100,"Msc"));
	   stu.add(new Student("Mahakaali",95,"BPharm"));
	   
	   return stu;
	  
   }
   public static void main(String[] args)
   {
	Arraylistclsrm al= new Arraylistclsrm();
	ArrayList<String>input1 = new ArrayList<String>();
	input1.add("Gowri");
	input1.add("Mahakaal");
	input1.add("Venkateswara");
	input1.add("Devaki Nandan");
	boolean arr[]= {true,false,true,false,true};
	//System.out.println(arr.length);
//	arr[5]=false;
//	arr[6]=true;
	
	ArrayList<Integer> input3 = new ArrayList<Integer>();
	input3.add(12);
	input3.add(34);
	input3.add(43);
	input3.add(56);
	ArrayList<Student> result =al.meth1(input1, arr, input3);
	System.out.println("\n"+result);
   }
}

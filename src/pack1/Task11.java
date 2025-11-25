package pack1;

public class Task11 
{
     public int meth1()
     {
	   System.out.println("meth1() called");
	   return 90;
     }
     public static void main(String[] args) {
    	 System.out.println("Start");
    	 int num = 10;
		Task11 t11 = new Task11();
		int result=t11.meth1();
		System.out.println("num: "+ num);
		System.out.println("Result: "+ result);
		System.out.println(num+ result);
		System.out.println("End");
	}

}

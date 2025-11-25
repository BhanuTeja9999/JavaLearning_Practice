package pack1;

public class Task15 {
   void meth1()
   {
	   System.out.println(10);
	   System.out.println(64);
	   System.out.println("End");
   }
   int meth2(int a ,int b,int c)
   {
	   System.out.println(a);
	   Task15 obj = new Task15();
	    String s=obj.meth5(100,"Java is Awesome");
	    System.out.println(s);
	    return a-b;

   }
   String meth3(String s, int b,int d)
   {
	   System.out.println(b + d);
	   return s;
   }
   int meth4(int c,int k)
   {
	   System.out.println(k);
	 Task15 t = new Task15();
	 int result = t.meth2(50, 50, 50);
	 System.out.println(result);
	 return k+10;
   }
   
   String meth5(int a, String L)
   {
	   System.out.println(a+a);
	   Task15 t = new Task15();
	   String s = t.meth3("Hi",20, 10);
	   System.out.println(s);
	   return L;
   }
   
   public static void main(String[] args)
   {
	   Task15 t = new Task15();
	   System.out.println("Start");
	   int result = t.meth4(20,10);
	   System.out.println(result);
	   t.meth1();
   }
}

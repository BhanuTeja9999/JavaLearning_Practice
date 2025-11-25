package pack1;

public class Task4 {
   void method1()
   {
	   Task4 tobj4 = new Task4();
	   tobj4.method5();
	   int a = 43;
	   System.out.println(10);
	   System.out.println(54 + a);
   }
   void method2()
   {
	 int a = 30;
	 System.out.println(78- a);
	 Task4 tt = new Task4();
	 tt.method4();
   }
   void method3()
   {
	   int a = 30;
	   Task4 tobj = new Task4();
	   System.out.println(89 + 1);
	   tobj.method1();
	   System.out.println(a);
   }
   void method4()
   {
	   int c = 55;
	   System.out.println(c);
   } 
   void method5()
   {
	   System.out.println(77);
	   Task4 tobj5 = new Task4();
	   tobj5.method2();
	   System.out.println(99);
   }
   public static void main(String[] args) {
	System.out.println("Start");
     Task4 t4=new Task4();
     t4.method3();
     System.out.println("End");
	
   }
}

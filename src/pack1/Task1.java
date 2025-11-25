package pack1;

public class Task1 {
   public void meth1()
   {
	  System.out.println("Hi from meth1()");
	  System.out.println(100);
	  
   }
   public void meth2()
   {
	   System.out.println("Hello from meth2()");
	   System.out.println(200);
   }
	
	
  public static void main(String[] args) {
     System.out.println("Start");
     System.out.println("Java is Awesome");
     Task1 t = new Task1();
     t.meth1();
     t.meth2();
     System.out.println("End");
     
}
}

package pack1;

public class Task2 {
  void meth1()
  {
	  System.out.println("Hi");
	  Task2 t2 = new Task2();
	  t2.meth2();
	  System.out.println(10);
	  
  }
  void meth2()
  {
	  System.out.println("Hello");
	  System.out.println(20);
  }
  public static void main(String[] args) {
	System.out.println("Start");
	System.out.println("Java is awesome");
	Task2 t2 = new Task2();
	t2.meth1();
	System.out.println("End");
			
}
}

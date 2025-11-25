package pack1;

public class Task20 {
  int meth1()
  {
	  System.out.println("hi");
	  return 5;
  }
  int meth2()
  {
	  System.out.println("hello");
	  return 10;
  }
  int meth3(int x,int y)
  {
	  System.out.println("Java is awesome");
	  return x+y+(new Task20().meth1()*2);
  }
  public static void main(String[] args) {
	Task20 t = new Task20();
	System.out.println(((t.meth3(t.meth1(),t.meth2())) + t.meth1())/t.meth2()  );
}
}

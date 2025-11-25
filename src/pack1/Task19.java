package pack1;

public class Task19
{
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
	  return x+y+(new Task19().meth1()*2);
  }
  
  public static void main(String[] args) {
	System.out.println(new Task19().meth3(new Task19().meth1(),new Task19().meth2( )));
}
}

package Java8Features;
import java.util.ArrayList;
public interface InterfaceA 
{
  void meth1(int a, ArrayList<String> al);
  default void wish()
  {
	  System.out.println("hello");
  }
}

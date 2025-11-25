package pack1;

public class Task12 {
 public int meth1()
 {
	 System.out.println("Hi");
	 return 99;
 }
 public static void main(String[] args) {
	Task12 t = new Task12();
	t.meth1();
	int i = t.meth1();
	System.out.println(i);
	//System.out.println(aobj.meth1());
	System.out.println(99 + 99);
	System.out.println(t.meth1()+99);
	System.out.println(t.meth1()+t.meth1());
}
}

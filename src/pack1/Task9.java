package pack1;

public class Task9 {

	void meth1(int a, String s)
	{
		System.out.println(a+a);
		System.out.println("a");
		System.out.println('a');
		System.out.println(a);
		System.out.println("s: "+s);
	}
	void meth2(int a,int b)
	{
		System.out.println(a*a);
		System.out.println(b);
		new Task9().meth4( "Java is Awesome");
		new Task9().meth3('A', 100);
		System.out.println(a-b);
	}
	void meth3(char c,int a)
	{
	  System.out.println(c);
	  System.out.println('c');
	  System.out.println(a);
	}
	void meth4(String s)
	{
		new Task9().meth1(10,"Hello World");
		
		System.out.println(s);
		
	}
	public static void main(String[] args) {
		System.out.println("Start");
		new Task9().meth2(5, 10);
		System.out.println("End");
	}
	
}

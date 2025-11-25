package pack1;

public class Task14 {

	int meth1(int x,String msg) {
		System.out.println("hi");
		System.out.println(msg);
		return x+1;
	}
	int meth2()
	{
		System.out.println("hello");
		System.out.println(new Task14().meth1(5, "Java is Awesome"));
		return 100;
	}
	public static void main(String[] args) {
		System.out.println(new Task14().meth2());
	}
}

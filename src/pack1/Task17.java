package pack1;

public class Task17 {

	int meth1()
	{
		System.out.println("hi");
		return new Task17().meth2()+ 99;
	}
	int meth2()
	{
		System.out.println("hello");
		return 1;
	}
	public static void main(String[] args) {
		Task17 t = new Task17();
		System.out.println(t.meth1()/2+ t.meth1());
	}
}

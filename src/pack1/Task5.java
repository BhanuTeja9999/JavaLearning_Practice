package pack1;

public class Task5 {

	void meth1()
	{
		System.out.println("Hi from meth1()");
	}
	
	public static void main(String[] args) {
		System.out.println("Start");
	    Task5 t = new Task5();
	    t.meth1();
	    new Task5().meth1();
	    System.out.println("End");
	}
}

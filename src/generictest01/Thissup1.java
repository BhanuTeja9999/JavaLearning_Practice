package generictest01;

public class Thissup1 {

	void meth1()
	{
		System.out.println("Thissup1 method");
	}
	Thissup1()
	{
		this(500);
		this.meth1();
	}
	Thissup1(int x)
	{
		System.out.println("Thissup1 Parameterized Constructor");
	}
}

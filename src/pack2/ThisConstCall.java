package pack2;

public class ThisConstCall
{

	void meth1()
	{
		System.out.println("meth1() called");
	}
	ThisConstCall()
	{
		this(100);
		System.out.println("Default Constructor Called");
		new ThisConstCall(100);
		this.meth1();
	}
	ThisConstCall(int i)
	{
		System.out.println("Parameterized Constructor called :"+i);
	}
	public static void main(String[] args) {
		new ThisConstCall();
	}
	
}

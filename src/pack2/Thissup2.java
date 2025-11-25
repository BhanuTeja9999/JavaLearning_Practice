package pack2;


public class Thissup2 extends Thissup1
{
	void meth2()
	{
		System.out.println("Thissup2 method");
		super.meth1();
	}
	Thissup2()
	{
		System.out.println("Thissup2 default constructor");
	}
	Thissup2(int x)
	{
		super();
		this.meth2();
		new Thissup2();
		System.out.println("Thissup2 parameterized constructor");
		
	}
	
	public static void main(String[] args) {
		Thissup2 bobj = new Thissup2(100);
		bobj.meth2();
	}
}

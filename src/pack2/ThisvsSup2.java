package pack2;

public class ThisvsSup2 extends ThisvsSup{
  
	void meth2()
	{
		System.out.println("meth2() called");
	}
	
	ThisvsSup2()
	{
		this(500);  //super() call will not be executed here
		this.meth2();
		super.meth1();
		System.out.println(30);
	}
	
	ThisvsSup2(int x)
	{   //super() compiler by default adds this
		System.out.println(40);
	}
	
	public static void main(String[] args) {
		new ThisvsSup2();
	}
}

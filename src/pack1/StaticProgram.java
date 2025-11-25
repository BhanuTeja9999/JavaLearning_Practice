package pack1;

public class StaticProgram
{
   static int x = StaticProgram.method1();
	static int method1()
	{
		System.out.println("static meth1() called");
		return 5;
		
	}
	public static void main(String[] args) {
		System.out.println("main() called: "+x);
	}
	static 
	{
		System.out.println("static block executed");
	}
}

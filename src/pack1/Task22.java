package pack1;

public class Task22 {

	public String testMethod1()
	{
		System.out.println(35);
		return new Task22().testMethod3( new Task22().testMethod2())+ new Task22().testMethod4("here");
	}
	public int testMethod2()
	{
		System.out.println(25);
		return 25+25;
	}
	public String testMethod3(int a)
	{
		System.out.println(15);
		return "is";
	}
	public String testMethod4(String s)
	{
		System.out.println(45);
		return "awesome";
	}
	
	public static void main(String[] args) {
		Task22 t = new Task22();
		System.out.println("Java "+ t.testMethod1());
	}
}

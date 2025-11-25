
package pack1;

public class StaticKeyword1 {

	int x;
	static int y;
	 StaticKeyword1()
	{
		x++;
		y++;
		System.out.println("Instance Variable x: "+x);
		System.out.println("Static   Variable y: "+y);
		System.out.println("-----------------------------------");
		
	}
	public static void main(String[] args) {
		
		
		new StaticKeyword1();
		new StaticKeyword1();
		new StaticKeyword1();
		
	}
}



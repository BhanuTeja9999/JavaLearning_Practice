package pack1;
import java.util.Scanner;

public class ClassB {
	static void method1()
	{
		System.out.print("hi");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print( ClassA.add(a,b));
		sc.close();
	}
	public static void main(String[] args) {
		 ClassB.method1();
	}
}

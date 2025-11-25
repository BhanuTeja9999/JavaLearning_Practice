package pack1;

public class Task13 {

	char meth1(int i)
	{
		System.out.println("Hi");
		System.out.println(i);
		System.out.println("i");
		System.out.println('i');
		System.out.println(i - 99);
		return 'J';
	}
	public static void main(String[] args) {
		System.out.println(new Task13().meth1(100));
	}
}

package pack1;

public class Task6 {

	
	void msg()
	{
		System.out.println("Java is Awesome");
	}
	
	void greeting()
	{
		System.out.println("Good morning");
	}
	public static void main(String[] args) {
	   Task6 o6 = new Task6();
	   o6.msg();
	   o6.greeting();
	   System.out.println("----------------------------------------");
	   new Task6().msg();
	   new Task6().greeting();
	}
}

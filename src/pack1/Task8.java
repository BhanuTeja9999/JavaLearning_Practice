package pack1;

public class Task8 {
	void meth1(int x ,int y)
	{
		System.out.println("x :"+x);
		System.out.println("y :"+y);
		System.out.println("Addition :"+x+y);//concatenated 99 and 1 as a string value along with 'addition'
		System.out.println("Addition :"+(x+y));
	}
	public static void main(String[] args) {
		Task8 add = new Task8();
		add.meth1(99,1);
	}

}

package pack1;

public class Task18 {
	String meth1(int a,int b)
	{
		System.out.println(10);
		System.out.println((54+a)-b);
		int value = new Task18().meth5();
		System.out.println(value);
		return "Java";
	}
	
	int meth2(int a)
	{
		System.out.println(75);
		int b = 5;
		System.out.println(b-a);
		return (5*5)-b;
		
	}
	
    void meth3()
	{
		System.out.println("Start");
		System.out.println(new Task18().meth4());
		System.out.println(40);
	}
    String meth4()
    {
    	System.out.println("Today is Sunday");
    	return new Task18().meth1(4, 8);
    }
    
    int meth5()
    {
    	Task18 t = new Task18();
    	System.out.println(99);
    	return t.meth2(5);
    	
    }
    public static void main(String[] args) {
		Task18 t = new Task18();
		t.meth3();
	}

}

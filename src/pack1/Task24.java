package pack1;

public class Task24
{
	static int prgno=24;
	short s = 99;
	
	Task24()
	{

		System.out.println("==============Default Constructor=====================");
	}
	Task24(int i)
	{
		System.out.println("You passed the value : "+i);
	}
	
	void meth1()
	{   short s =99;
		System.out.println("meth1() called");
		System.out.println("local variable value: "+s);
		System.out.println("Instance variable value: "+new Task24().s);
		new Task24(34).meth2("Hello");
	}
	void meth2(String s)
	{
		System.out.println(s+" is passed from meth1()");
		System.out.println(new Task24().meth3(97)); ;
	}
	char meth3(int c)
	{
		new Task24().meth4();
		return (char) c;
	}
	int meth4()
	{
		int x = 5;
		x--;
		int y = x++;
		--y;
		System.out.println("Balance is known :" +new Task24().meth5(600,400));;
		return y;
	}
    boolean meth5(int pocket,int account)
    {
    	System.out.println("You have "+(pocket+account)+" with you");
    	new Task24().meth6();
    	return pocket>account && account<pocket;
    }
    void meth6()
    {
    	int a=60;
    	int b=30;
    	int c = a*70+b*a-(b*100)+(b/2);
    	new Task24().meth7();
    	System.out.println("c value: "+c);
    }
    void meth7()
    {
    	System.out.println("----Performing implicit Type casting(Widening)-----");
    	int i2=100;
    	float f1 =i2;
    	System.out.println("\nint PDT i2: "+i2);
    	System.out.println("float PDT f1: "+f1);
    	System.out.println("----Performing  ExplicitType casting(Narrowing)-----");
        int i3=500;
        byte b3 =(byte)i3;
        System.out.println("\n int PDT i3 :"+i3);
        System.out.println("\n byte PDT : "+b3);
        new Task24().meth8();
    }
    void meth8()
    { 
    	System.out.println("Auto Boxing");
    	boolean flag = true;
    	Boolean bool= new Boolean(flag);
    	System.out.println("\nBoolean PDT flag: "+flag);
    	System.out.println("Boolean WCO boolean val: " + bool);
    	
    	System.out.println("Auto UnBoxing");
    	Integer ival2 = 60;
    	int i4= ival2.intValue();
    	System.out.println("Integer WCO  val: " + ival2);
    	System.out.println("\nint pdt: "+i4);

    	
    	
    	
    }
    String eligibility(int age,String name)
    {
      Integer i = age;
      if (!(i<=18))
       return "eligible";
      else 
      {
    	  System.out.println(name+" You should wait for "+(18-i)+" years");
    	  return "not eligible";
      }
    }
    static 
    {
    	System.out.println("Welcome to the Program");
    }
    static void checkforvote()
    {
    	new Task24().eligibility(20,"Bhanu");
    }
    protected void finalize()
    {
    	System.out.println("Garbage collected");
    }
     public static void main(String[] args) 
     {  System.out.println("This is program no: "+Task24.prgno);
    	checkforvote();
    	Task24 t24=new Task24();
    
    	t24.meth1();
    	System.out.println(t24.hashCode());
    	System.out.println(t24.getClass());
    	System.out.println(t24.toString());
    	System.out.println(new Task24().equals(t24));
       t24 = null;
		System.out.println("Java is awesome");
	 }
}

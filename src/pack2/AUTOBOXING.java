package pack2;

public class AUTOBOXING 
{

	 static void meth1()
	{
		System.out.println("Implementing Auto-Boxing\n");
		int i =10;
		Integer ival1 = i; //first way
		Integer ival2 = new Integer(i);//2nd way
		Integer ival3 = Integer.valueOf(i);
		System.out.println("int primitive data type value : "+i);
		System.out.println("Integer Wrapper Class Object ival1: "+ival1);
		System.out.println("Integer Wrapper Class Object ival2: "+ival2);
		System.out.println("Integer Wrapper Class Object ival3: "+ival3);
		
		
		short s = 500;
		Short sval = s;
		Short sval1 = Short.valueOf(s);
		Short sval2 = new Short(s);
		System.out.println("\nshort Primitive Data Type s: "+s);
		System.out.println("Short Wrapper Class Object sval: "+sval);
		System.out.println("Short Wrapper Class Object sval2: "+sval1);
		System.out.println("Short Wrapper Class Object sval2: "+sval2);
		
		boolean flag = true;
		Boolean booleanval1=flag;
		Boolean booleanval2 = Boolean.valueOf(flag);
		Boolean booleanval3 = new Boolean(flag);
		System.out.println("\nBoolean Primitive Data Type flag: "+flag);
		System.out.println("Boolean Wrapper Class Object booleanval1: "+booleanval1);
		System.out.println("Boolean Wrapper Class Object booleanval2: "+booleanval2);
		System.out.println("Short Wrapper Class Object booleanval3: "+booleanval3);
		System.out.println(booleanval1.getClass());
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("Calling meth1()");
		meth1();
	}
}

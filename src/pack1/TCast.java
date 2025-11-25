package pack1;
 /* Type casting Program */
public class TCast {

	void meth1()
	{
		System.out.println("Performing Implicit Type casting\n");
		byte b1 =10;
		int i1=b1;
		System.out.println("byte PDT b1: "+b1);
		System.out.println("int PDT i1: "+i1);
		
		int i2=100;
		float f1=i2;
		System.out.println("int PDT i2: "+i2);
		System.out.println("float PDT f1: "+f1);
		
		char c1='A';
		double d1 = c1;
		long l1= c1;
		
		System.out.println("\n char PDT c1: "+c1);
		System.out.println("double PDT d1: "+d1);
		System.out.println("long PDT l1: "+l1);
		
		
	}
	void meth2()
	{
		System.out.println("Performing Explicit Type casting..");
		int i1=10;
		//byte b1 = i1; //c.t.e becoz if i1 value changes in the future then it is not possible for the byte variable to store such large value
		byte b1 =(byte)i1;
		System.out.println("\nint PDT i1: "+i1);
		System.out.println("byte PDT b1: "+b1);
		
		final int i2 = 50;//final variables are COMPILE TIME CONSTANTS
		//i2 = i2+i2+i2//C.T.E
		byte b2 = i2;
/*i2 is of type int .but we assigned it to b2(byte) variable without explicit type casting.
because now compiler came to know its value is 50 only(no changes in the future).
 we restricted the i2 variable to hold 50 only using 'final' keyword.*/
		System.out.println("\nint PDT i2: "+i2);
		System.out.println("byte PDT b2: "+b2);
		
		int i3 = 500;
		byte b3 =(byte)i3; //byte range is : -128 to 127
		System.out.println("\n int PDT i3: "+i3);//500
		System.out.println("\nbyte PDT: "+b3);//-12
		
		
		/* [minimumRange(of small)+(result-maximumRange(of small) -1)]
		 * -128 +( 500 -127-1)==>500-256= 244==>still value is exceeding the byte range.
		 * Again
		 * -128+(244-127-1)=244-256 = -12(-128<= -12  <=127)//OK
		 */
		float f1 = 10.9999f;
		byte b4 = (byte)f1;
		System.out.println("\nfloat PDT f1:  " +f1);
		System.out.println("byte PDT b4: "+b4);
	}
	void msg(byte b)
	{
		System.out.println("Java is awesome!!! "+b);
	}
	public static void main(String[] args) {
		TCast aobj = new TCast();
		aobj.meth1();
		aobj.meth2();
		aobj.msg((byte) 5);
		//Every number in Java is by default considered as Int.
	}
}

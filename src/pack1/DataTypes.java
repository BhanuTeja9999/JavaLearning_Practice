package pack1;

public class DataTypes {

	int i;
	byte b;
	short s;
	long l;
	
	float f;
	double d;
	char c;
	
	boolean flag;
	void method1()
	{
		System.out.println("meth1() called");
		System.out.println("int value: "+ i);
		System.out.println("short  value: "+s);
		System.out.println("long value: "+l);
		System.out.println("float value: "+f);
		System.out.println("double value: "+d);
		System.out.println("char value: "+c);//Non-Printable character:\u0000
	
	}
	
	void method2()
	{
		System.out.println("\nmeth2() called");
		int i1=100;
		int i2=500;
		int i3 = i1+i2;
		System.out.println("i3:"+ i3);
		
		byte b1=10;
		byte b2 =50;
		byte b3= (byte)(b1+b2);
		System.out.println("b3: "+b3);
		
		float f =10.9F;
		System.out.println("f "+f);
		long x = 2147483647777L; //l is mandatory
		System.out.println("x: "+x);
		//Every number in java is by default considered as integer(int).
		//Every decimal value in Java is by default considered as double.
	}
	public static void main(String[] args) {
		DataTypes dt = new DataTypes();
		dt.method1();
		System.out.println("----------------------------");
		dt.method2();
	}
}


/*byte: An 8-bit signed two's complement integer.
Range: -128 to 127
short: A 16-bit signed two's complement integer.
Range: -32,768 to 32,767
int: A 32-bit signed two's complement integer.
Range: -2,147,483,648 to 2,147,483,647 (or -2^31 to 2^31 - 1)
long: A 64-bit signed two's complement integer.
Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (or -2^63 to 2^63 - 1)
float: A 32-bit single-precision IEEE 754 floating-point number.
Range: Approximately ±3.40282347E+38F (positive and negative) with about 6-7 significant decimal digits.
double: A 64-bit double-precision IEEE 754 floating-point number.
Range: Approximately ±1.79769313486231570E+308 (positive and negative) with about 15-16 significant decimal digits.
boolean: Represents a logical value.
Values: true or false
char: A 16-bit Unicode character.
Range: \u0000 (or 0) to \uffff (or 65,535 inclusive)*/

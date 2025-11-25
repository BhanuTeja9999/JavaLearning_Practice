package pack1;

public class ArithmeticOperations {
	void add(int a,int b) {
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
		System.out.println("Sum is :"+(a+b));
	}
	void sub(int a,int b) {
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
		System.out.println("Difference is :"+(a-b));
	}
	void mul(int a,int b) {
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
		System.out.println("Product is :"+(a*b));
	}
	void div(int a,int b) {
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
		System.out.println("Quotient is :"+(a/b));
	}
	void mdiv(int a ,int b)
	{
		System.out.println("a value :"+a);
		System.out.println("b value :"+b);
		System.out.println("Remainder is :"+(a%b));
	}
	public static void main(String[] args) {
		ArithmeticOperations ao = new ArithmeticOperations();
		ao.add(6, 3);
		ao.sub(34, -9);
		ao.mul(5, 3);
		ao.div(10,2);
		ao.mdiv(36, 7);
	}
}

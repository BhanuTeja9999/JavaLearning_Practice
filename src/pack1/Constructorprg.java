package pack1;

public class Constructorprg {

	int calculate(int x)
	{
		System.out.println("Inside calculate: "+x);
		return x*3;
	}
	int compute(int a, int b)
	{
		System.out.println("Inside compute: "+a+","+b);
		return a+b;
	}
	int process(int m,int n)
	{
		System.out.println("Inside Process: "+m+","+n);
		return m-n;
	}
	int analyze(int p,int q,int r)
	{
		System.out.println("Inside analyze :"+p+","+q+","+r);
		return p*q+r;
	}
	int evaluate(int x)
	{
		System.out.println("Inside evaluate: "+x);
		return x/2;
	}
	 Constructorprg()
	{
		System.out.println(10);
	}
	 Constructorprg(int a,String s)
	{
		System.out.println(a);
		System.out.println(s);
	}
	 Constructorprg(String s,int x)
	 {
		 System.out.println(s);
		 System.out.println((x*2)+100);
	 }
	 public static void main(String[] args) {
		int result = new Constructorprg().calculate(6);
	
		System.out.println("Result is : "+result);
	}
}

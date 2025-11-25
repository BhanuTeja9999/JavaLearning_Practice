package pack2;

public class Forloop
{
	
	void meth10()
	{
		System.out.println("-------meth10() called--------");
		int sum = 0;
		for(int i=1;i<=3;i++)
			sum+=i;
		for(int j=1;j<=5;j++)
			if(j%2==0)
				sum+=j;
			else sum-=j;
		int k=1;
		while(k<=3)
		{
			sum+=k*2;
			k++;
		}
		int m=5;
		do
		{
			sum-=m;
			m--;
		}while(m>2);
		System.out.println("Final sum = "+sum);
		System.out.println("meth10() execution completed");
	}
  public static void main(String[] args)
  {
	Forloop fl = new Forloop();
	    fl.meth10();
}
	
}

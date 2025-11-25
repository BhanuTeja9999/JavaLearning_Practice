package pack2;

public class Yield2 
{
   public static void main(String[] args)throws InterruptedException
   {
	Yield1 yobj = new Yield1();
	yobj.start();
    Thread.yield();
	for(int i =1;i<=5;i++)
	{
		System.out.println("ClassB main() :"+i);
	}
   }
}

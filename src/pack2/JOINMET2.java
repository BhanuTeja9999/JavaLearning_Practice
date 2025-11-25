package pack2;

public class JOINMET2
{
   public static void main(String[] args)throws InterruptedException
   {
	JOINMET aobj=new JOINMET();
	aobj.start();
	aobj.join();//CONTROLLING THE FLOW OF THREAD
	
	for(int i =1;i<=5;i++)
	{
		System.out.println("JOINMET2 main() :"+i);
	}
}
}

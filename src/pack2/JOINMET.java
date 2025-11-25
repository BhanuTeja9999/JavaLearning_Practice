package pack2;

public class JOINMET extends Thread
{
   @Override
   public void run()
   {
	   for(int i = 1;i<=5;i++)
	   {
		   System.out.println("JOINMET :"+i);
	   }
   }
}

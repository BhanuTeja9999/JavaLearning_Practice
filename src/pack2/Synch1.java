package pack2;

public class Synch1 extends Thread
{
	
	public void run()
	{
		criticalResource();//method call
	}
	
	synchronized void criticalResource()
	{
		String name = Thread.currentThread().getName();
		System.out.println(name +" has entered run()");
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(name + " : "+i);
		}
	}
   public static void main(String[] args) 
   {
	  Synch1 s1 = new Synch1();
	  Thread t1 = new Thread(s1);
	  Thread t2 = new Thread(s1);
	  
	  t1.setName("First - Thread");
	  t2.setName("Second- Thread");
	  
	  t1.start();
	  t2.start();
   }
}

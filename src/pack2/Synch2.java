package pack2;

public class Synch2 extends Thread
{
   @Override
   public void run()
   {
	   String name = Thread.currentThread().getName();
	   System.out.println(name + "has  entered run()");
	   synchronized(this)
	   {
		   for(int i = 1;i<=5;i++)
		   {
			   System.out.println(name +" : "+i);
		   }
	   }
	   System.out.println(name + "completed run() execution");
   }//run()
   
   
   public static void main(String[] args)
   {
	Synch2 s2 = new Synch2();
	Thread t1 = new Thread(s2);
	Thread t2 = new Thread(s2);
	t1.setName("First-Thread");
	t2.setName("Second-Thread");
	
	t1.start();
	t2.start();
   }
}


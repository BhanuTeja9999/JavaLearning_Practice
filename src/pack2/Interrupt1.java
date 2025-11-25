package pack2;

public class Interrupt1 extends Thread
{
   
	@Override
	public void run()
	{
	  System.out.println("I am ready for interview");
	  for(int i = 1; i<=5;i++)
	  {
		  System.out.println("This is my "+i +" Interview");
	  }
	  System.out.println("I got placed now i can relax");
	  try {
		  Thread.sleep(10000);
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
		  System.out.println("My sleep got disturbed");
	  }
	  System.out.println("Time to go to office");
	}
	
	public static void main(String[] args) {
		Interrupt1 i1 = new Interrupt1();
		Thread t1 = new Thread(i1);
		t1.start();
		//t1.interrupt();
	}
	
}

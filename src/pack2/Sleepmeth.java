package pack2;

public class Sleepmeth
{
	
	
    public static void main(String[] args) throws InterruptedException 
    {
    	Sleepmeth sm=new Sleepmeth();
		System.out.println("J");
		Thread.sleep(5000);
		System.out.println("a");
		Thread.sleep(5000);
		//Thread thread = new Thread(sm);
		//thread.interrupt();
		System.out.println("v");
		Thread.sleep(5000,500);//milli,nano seconds
		System.out.println("a");
	}


}

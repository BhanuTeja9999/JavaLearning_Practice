package pack2;

public class MultiThr1 extends Thread
{

	public void run()
	{
		String name = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        
        System.out.println(name+" entered run()");
        for(int i =1;i<=5;i++)
        {
        	System.out.println(name+ "("+priority +")"+i);
        	
        }
        System.out.println(name + "Completed executing run()");
        
	}
	public static void main(String[] args) {
		MultiThr1 mt = new MultiThr1();
		Thread t1 = new Thread(mt);
		Thread t2 = new Thread(mt);
		
		t1.setName("First - Thread");
		t2.setName("Second - Thread");
		
		t1.setPriority(1); //t1.setPriority(MIN_PRIORITY);
		t2.setPriority(5); //t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}
	

}

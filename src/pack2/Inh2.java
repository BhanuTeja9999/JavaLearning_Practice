package pack2;

public class Inh2 extends Inh1
{
   public void meth2()
   {
	   System.out.println("Inh2 method");
   }
   
   public static void main(String[] args)
   {
	   Inh2 i2 = new Inh2();
	   i2.meth1();
   }
}

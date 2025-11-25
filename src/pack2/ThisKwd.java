package pack2;

//'This' Keyword is used to resolve the ambiguity between local and instance variables
public class ThisKwd 
{
   int x =10;//instance variable
   static int y =20;
   void meth1()
   {
	   System.out.println("meth1() called");
	   int x =100;//local variable
	   int y = 200;
	   System.out.println("Instance variable :"+this.x);
	   System.out.println("Static Variable :"+ThisKwd.y);
	   System.out.println("from meth1() "+this.hashCode());
   }
   
   public static void main(String[] args) {
	ThisKwd tk = new ThisKwd();
	tk.meth1();
	System.out.println("\nFrom main() :"+tk.hashCode());
	System.out.println("-------------------------------");
	ThisKwd tk2 = new ThisKwd();
	tk2.meth1();
	System.out.println("\n from main() :"+tk2.hashCode());
}
 
}

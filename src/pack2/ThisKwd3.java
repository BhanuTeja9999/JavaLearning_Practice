package pack2;
/*   
 * "This" is used to return the instance /object of the present class.
 */
public class ThisKwd3 
{
   ThisKwd3 meth1()  //Here class name is used as return type.Its return type is object.
   {
	   System.out.println("meth1() called");
	   return this;
   }
   ThisKwd3 meth2()
   {
	   System.out.println("meth2() called");
	   return this;
   }
   void meth3()
   {
	   System.out.println("meth3() called");
   }
   public static void main(String[] args) {
	new ThisKwd3().meth1().meth2().meth3();
}
}

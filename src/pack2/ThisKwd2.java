package pack2;

public class ThisKwd2
{
    void meth1()
    {   
        this.meth4();   //Valid but NOT recommended ThisKwd2.meth4() ====>Recommended i.e use  class name since it is static method.
    	System.out.println("meth1() called");//We can access a static method inside a non-static method.
    	                                     //but we can access a non static method inside a static method only with the help of respective class object.
    	
    }
    void meth2()
    {
    	meth1();//Compiler automatically adds 'this' to meth1() [this.meth1()] no need to add seperately.
    	System.out.println("meth2() called");
    }
    void meth3()
    { 
    	this.meth1();
    	System.out.println("meth3() called");
    }
    
   static void meth4()
    {
	    //this.meth2();//We cannot use 'this' keyword inside a **static area**.Because 'this' refers to current object instance.
	     System.out.println("meth4() called");
    }
   public static void main(String[] args) {
	
	   new ThisKwd2().meth3();
}
}

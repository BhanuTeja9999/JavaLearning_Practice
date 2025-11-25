package pack1;
//There are 3 classes participating in accessmodifiers program
//This program belongs to access modifiers
//There is another class named ClaassB present in pack1
//There is one more class named ClaassC present in pack2
public class ClaassA1 
{
   protected void meth1()
   {
	   System.out.println("ClassA1 protected method meth1() called");
   }
   private void meth2()
   {
	   System.out.println("I am private method");
   }
   
   public void meth3()
   {
	   System.out.println("Hey i am meth3() with {public} access modifier");
   }
   
   public static void main(String[] args) {
	 ClaassA1 aobj=new ClaassA1();
	 aobj.meth1();
	 aobj.meth2();
	 System.out.println(aobj.toString());
	 
	 ClaassB bobj = new ClaassB();
	 bobj.methB();
}
}

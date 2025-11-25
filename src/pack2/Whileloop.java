package pack2;

public class Whileloop 
{
   void meth1(int i)
   {
	   System.out.println("------meth1() called");
	   while(i<=5)
	   {
		   System.out.println("i value: "+i);
		   i++;
	   }
	   System.out.println("meth1() execution completed");
   }
   
   void meth2(int i)
   {
	   System.out.println("---------meth2() called--------");
	   while(i<=10)
	   {
		   System.out.println("i value :"+i++);
		   System.out.println("i value :"+ ++i);
		   i++;
		   
	   }
   }
   
   void meth3(int i)
   {
	   System.out.println("----------meth3() called-------");
	   while(i<=10) {
		   
		  // System.out.println("i value :"+ ++i + i++);//String concatenation andi idi// 
		 //System.out.println("i value :"+ (++i + i++));//if we use the brackets then it will be treated as expression.
		  System.out.println("i value : "+i++);
		  i=i++ +i++;
		   i++;

	   }
	   System.out.println("meth3() execution completed "+i);
   }
   
   void meth4(int i)
   {
	   System.out.println("--------meth4() called-----------");
	   while(i<=10)
	   {
		   System.out.println("i value :"+ i++);
		   i=i++ + i++;
	   }
   }
   
   void meth5(int i)
   {
	   System.out.println("-----meth5()--------");
	   while(i<=Whileloop.meth6())
	   {
		   System.out.println("i value :"+ ++i);
	   }
	   System.out.println("meth5() execution completed : "+i);
   }
   static int meth6()
   {
	   System.out.println("-------------------");
	   int num = 5;
	   return num--;
   }
   void meth7(int i,int j)
   {
	   System.out.println("---------meth7()----------");
	   while(i<=5)
	   {
		   System.out.println("------------------");
		   while(j>=1)
		   {
			   System.out.println(i++ + " "+j++);
			   System.out.println(i++ + " "+j--);
		   }
		   System.out.println("-------------------");
	   }
	  System.out.println("------meth7() execution completed------");
   }
   void meth8(int i)
   {
	   System.out.println("------meth8()--------");
	   while(i<=5)
	   {
		   System.out.println("i value : "+i);
		   i++;
		  
	   }
	   System.out.println("meth8() execution completed");
   }
   
   void meth9(int i)
   {
	   System.out.println("---------meth9()--------");
	   while(true)
	   {
		   System.out.println("i value :"+ i);
		   i++ ;
		   break;
	   }
	   System.out.println("meth9() execution completed ");//C.E becooz of unreachable code
   }
   
   
   
   public static void main(String[] args) {
   Whileloop w = new Whileloop();
   //w.meth1(1);
   //w.meth2(1);
   // w.meth3(1);
     w.meth4(1);
   //w.meth5(1);
   //w.meth6(1);
   //w.meth7(1);
   w.meth8(1);
}
}

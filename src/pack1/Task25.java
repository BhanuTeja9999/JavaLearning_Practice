package pack1;
//greater than program
public class Task25 
{
   String meth1(int a,int b ,int  c)
   {
	   String result;
	   if(a>b)
	   {
		   if(b>c)
		   {
			   result="a>b>c";
		   }
		   else if(a>c)
		   {
			   result="a>c>b";
		   }
		   else
		   {
			   result="c>a>b";
		   }
	   }
	   
	   else
	   {
		   if(a>c)
		   {
			   result="b>a>c";
		   }
		   else if(b>c)
		   {
			   result="b>c>a";
		   }
		   else
		   {
			   result="c>b>a";
		   }
	   }
	   
	   if(a==b)
	   {
		   if(b==c)
		   {
			   result="a==b==c";
		   }
		   else if(a>c)
		   {
			   result ="a==b>c";
		   }
		   else
		   {
			   result ="c>a==b";
		   }
	   }
	   
	   else if(b==c)
	   {
		   if(a>b)
		   {
			   result = "a>b==c";
		   }
		   else
		   {
			   result="b==c>a";
		   }
	   }
	   
	   else if(a==c)
	   {
		   if(b>a)
		   {
			   result="b>a==c";
		   }
		   else 
		   {
			   result ="a==c>b";
		   }
	   }
	   return result;
   }
   public static void main(String[] args) {
	Task25 obj= new Task25();
	System.out.println(obj.meth1(3, 2, 1));
	System.out.println(obj.meth1(1,2,3));
	System.out.println(obj.meth1(2,3, 1));
	System.out.println(obj.meth1(1,1, 1));
	System.out.println(obj.meth1(2,2,3));
	System.out.println(obj.meth1(3, 1, 1));
	System.out.println(obj.meth1(1,3,2));
	System.out.println(obj.meth1(2,2,2));
}
}

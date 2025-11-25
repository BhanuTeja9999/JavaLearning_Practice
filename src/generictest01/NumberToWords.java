package generictest01;

public class NumberToWords 
{
   public void pw(int n,String ch)
   {
	   String one[]= { " ","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten",
			          "Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"
	   };
	   String ten[]= {" "," ","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
	   
	      if(n>19)
	      {
	    	  System.out.println(ten[n/10]+" "+one[n%10]);
	      }
	      else
	      {
	    	  System.out.println(one[n]);
	      }
	      if(n>0)
	    	  System.out.println(ch);
   }
   
   public static void main(String[] args) {
	 int n = 19;
	 System.out.println(n);
	 if(n<=0)
	 {
		 System.out.println("Enter numbers greater than 0");
	 }
	 else
	 {
		 NumberToWords a = new NumberToWords();
		 a.pw((n),"Hundred");
	 }
}
}

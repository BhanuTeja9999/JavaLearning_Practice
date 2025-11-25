package pack1;

public class shopdiscount {
   void discount(int units)
   {
	  
	   int total_cost = units*100;
	   System.out.println("No of units: "+units);
	   if (units>=1000)
	   {
		   System.out.println("Discount is there");
		   int final_cost=total_cost-(total_cost*10)/100;
		   System.out.println("total cost is :"+final_cost);
		   
	   }
	   else
	   {
		   System.out.println("total cost is :"+total_cost);
	   }
   }
   public static void main(String[] args) {
    new shopdiscount().discount(1100);
}
}

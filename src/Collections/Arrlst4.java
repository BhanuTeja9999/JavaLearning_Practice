package Collections;

import java.util.ArrayList;

public class Arrlst4
{
   public static void main(String[] args)
   {
	 ArrayList<Integer> Iar1 = new ArrayList<Integer>();
	 Iar1.add(44);
	 Iar1.add(12);
	 Iar1.add(34);
	 Iar1.add(21);
	 System.out.println("1st ArrayList : "+Iar1);

	 ArrayList<Integer> Iar2 = new ArrayList<Integer>();
	 Iar2.add(-22);
	 Iar2.add(-98);
	 Iar2.add(0);
	 System.out.println("2nd ArrayList : "+Iar2);

	 
	 ArrayList<Integer> ar3 = new ArrayList<Integer>();
	 ar3.addAll(Iar1);
	 ar3.addAll(Iar2);
	 
	 System.out.println("Merged ArrayList : "+ar3);
	 
   }
}

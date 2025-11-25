package pack2;

public class Juices_Menu 
{

	void displayPrice(String s)
	{
		switch(s)
		{
		   case "Grape":
			   System.out.println("\nPrice of Grape Juice is ₹20");
			   break;
		   case "Mango":
			   System.out.println("\nPrice of Mango Juice is ₹20");
			   break;
		   case "Badam milk":
			   System.out.println("\nPrice of Badam Milk is ₹30");
			   break;
		   case "Lassi":
			   System.out.println("\nPrice of Lassi is ₹50");
			   break;
		   case "Sapota":
			   System.out.println("\nPrice of Sapota juice is : ₹40");
			   break;		   
		   case "Fruit Salad":
			   System.out.println("\nPrice of Fruit Salad is ₹50");
			   break;
		   default:
			   System.out.println("\nSorry we don't have "+s+" juice");
		}
	}
	public static void main(String[] args) {
		System.out.println("==========Bhanu Juice Point=========");
		System.out.println("\n******Menu******");
		System.out.println("1.Grape\n2.Mango\n3.Badam Milk\n4.Lassi\n5.Sapota\n6.Fruit Salad");
		new Juices_Menu().displayPrice("Sapota");
		new Juices_Menu().displayPrice("Pineapple");
	}
}

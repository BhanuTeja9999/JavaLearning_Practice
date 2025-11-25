package pack1;
/*Increment Decrement Operators Program*/
public class HardT 
{
    int c;
    static int e;
    HardT()
    {
    	System.out.println(++c);
    	System.out.println(++e);
    }
    
   public static void main(String[] args) {
	int a =34;
	int b = 21;
	new HardT().c= a++ + ++b;
	int d = --a + --b + new HardT().c--;
	e = a+ +b+ + new HardT().c+d--;
	int f = -a + b-- + new HardT().c -d++;
	int sum = a+b+new HardT().c+d+e+f;
	System.out.println("Sum ="+sum);
   }

}

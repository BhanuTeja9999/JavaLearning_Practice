package test;

public class Test03
{
	public static void main(String[] args) { 
        float f = 12;
        /*switch(f)*/ switch(5) { // Line 1 
        case 10 + 1: // Line 2 
            System.out.println("Twelve"); 
        case 0: // Line 3 
            System.out.println("Zero"); 
        case (int) 12.0: 
            System.out.println("Decimal"); 
        default: 
            System.out.println("Default");
   //Compilation error in Line 1 " Cannot use float type in switch"        
        }
	}
}

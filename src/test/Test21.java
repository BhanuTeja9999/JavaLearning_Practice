package test;
import java.util.Scanner;
public class Test21 
{
	
	public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       //System.out.println("Enter the values : ");
        int num1=0;

        int num2=5;

        if ((num1 / num2 == 5) && (num1 + num2) > 5) {

                       System.out.println("1");

        } else if ((num1 - num2) >= 1 || (num1 % num2) == 0) {

                       System.out.println("2");

        } else {

                       System.out.println("3");

        }
        sc.close();

}


}
//poyindi
package generictest01;
import java.util.Scanner;
public class Arrydoubt {

	void meth1()
	{
		int arr[]= new int[5];
		/*
		 * arr[1]=5; arr[2]=6; arr[3]=9;
		 */
		Scanner sc = new Scanner(System.in);
		 for(int i =1;i<=arr.length-1;i++)
		 {
			arr[i]=sc.nextInt();
		 }
		 System.out.println("------");
		 for(int i =0;i<=arr.length-1;i++)
		 {
			 System.out.println(arr[i]);
		 }
	}
	public static void main(String[] args) {
		new Arrydoubt().meth1();
		}
}

package pack2;

import java.util.Arrays;
import java.util.Scanner;
public class MovieTicketBooking
{
	Scanner sc = new Scanner(System.in);
	void ticketBooking()
	{
		System.out.println("Welcome to the e-movie ticket booking portal");
		System.out.println("Enter the name of the movie you want to watch ");
		String movie_name = sc.nextLine();
		System.out.println("How many tickets you need ? ");
		
		int no_tickets = Integer.parseInt(sc.nextLine());
		String names[]=new String[no_tickets];//I took a string array created using string class to take 
		System.out.println("\nEnter "+names.length + " names for ticket booking");
		
		for(int i =0;i<=names.length-1;i++)
		{
			names[i] = sc.nextLine();
		}
		System.out.println("Selecting seats for : "+Arrays.toString(names));
		System.out.println("\nPlease choose the seat Rows between A to Z ");
		String row = sc.nextLine();
		
		System.out.println("\nPlease choose the starting seat number between 1 to 30");
		int seat_no=Integer.parseInt(sc.nextLine());
		System.out.println(names.length + " tickets were booked below are the details ");
		for(String s : names)
			System.out.println(s +" ==> "+row + "-"+seat_no++);
		System.out.println("\nEnjoy your "+movie_name + " :)");
	}
	public static void main(String[] args) {
		new MovieTicketBooking().ticketBooking();
	}
   
}

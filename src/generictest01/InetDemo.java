package generictest01;

import java.net.*;
public class InetDemo
{
  public static void main(String[] args) {
	try
	{
		InetAddress ip = InetAddress.getByName("www.google.com");
		System.out.println("Host Name :"+ip.getHostName());
		System.out.println("IP Address :"+ip.getHostAddress());
		System.out.println(ip.getByName("www.google.com"));
		System.out.println(InetAddress.getAllByName("www.google.com"));
		System.out.println(ip.getLocalHost());
		System.out.println(ip.getHostAddress());
		
	}
	catch(UnknownHostException e)
	
	{
		System.out.println(e);
	}
}
}

package generictest01;

import java.net.*;
public class URLDemo {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://mnc.com/javaurl");
			System.out.println("Protocol: "+url.getProtocol());  
			System.out.println("Host Name: "+url.getHost());  
			System.out.println("Port Number: "+url.getPort());
			 System.out.println("Default Port Number: "+url.getDefaultPort());  
			 System.out.println("getPath(): "+url.getPath()); 
			System.out.println("File Name: "+url.getFile()); 
			System.out.println(url.getQuery());
		}
		 catch(Exception e) {
			 System.out.println(e);
			 } 
	}
}

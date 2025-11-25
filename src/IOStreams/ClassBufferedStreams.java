package IOStreams;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;

/*Buffered Streams
│
├── Buffered Byte Streams
│   ├── BufferedInputStream
│   └── BufferedOutputStream
│
└── Buffered Character Streams
    ├── BufferedReader
    └── BufferedWriter*/

public class ClassBufferedStreams 
{
   void fileOperations() throws Exception
   {
	   System.out.println("Reading  the data from a file by using buffered byte streams\n");
	   BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D:\\FULL STACK DEV USING JAVA\\Bhanu\\file5.txt"));
	   System.out.println("Connection created");
	   
	   int i;
	   while((i=bis.read())!=-1)
	   {
		   System.out.print((char)i);
	   }
	   bis.close();
	   
	   System.out.println("\n\nData Retrieved");
	   BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\FULL STACK DEV USING JAVA\\Bhanu\\file5.txt",true));
	   System.out.println("\n\nConnection created by BufferedWriter");
	   
	   String s= " Java is awesome";
	   bw.write(s);
	   
	   //bw.flush();
	   bw.close();
	   System.out.println("Data entered");
   }
   
   public static void main(String[] args) throws Exception
   {
	  ClassBufferedStreams bs = new ClassBufferedStreams();
	  bs.fileOperations();
   }
}

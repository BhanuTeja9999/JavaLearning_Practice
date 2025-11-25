package IOStreams;
import java.io.FileWriter;
import java.io.FileReader;

/*                          Character Streams
 *                      --------------------------
 * 
 *            |->Reader->FileReader->read() -->return type is int.Returns ASCII values of the characters.
 *            |                               If no character is found ..returns -1.     
 * Character Streams
 *            |->Writer ->FileWriter ->write()-->In character Streams data will be transferred in the form of characters & the length of each data packet is of *2 bytes*   
 *                                                 |
 *                                                 |(accepts)
 *                                        -------------------- 
 *                                        |                   |
 *                                        ↓                   ↓
 *                                        int               String
 */

public class ClassCharacterStreams
{
   void fileOperations1() throws Exception
   {
	   System.out.println("Reading data from the file");
	   FileReader rd = new FileReader("D:\\FULL STACK DEV USING JAVA\\Bhanu\\file1.txt");
	   System.out.println("Connection created");
	   int i;
	   while((i=rd.read())!=-1)
	   {
		   System.out.print((char) i);
	   }
	   System.out.println("\nData retrieved");
	   rd.close();
	   
   }
   void fileOperations2() throws Exception
   {
	   System.out.println("Writing the data into the file");
	   FileWriter fw = new FileWriter("D:\\FULL STACK DEV USING JAVA\\Bhanu\\file4.txt",true);
	   System.out.println("Connection is created");
	   String data = ",Tomorrow is Wednesday";
	   fw.write(data);
	   System.out.println("Data Entered");
	   fw.close();
   }
   void fileOperations3() throws Exception //does not support image copying but file will be created
   {
	   System.out.println("Reading data from the file");
	   FileReader rd = new FileReader("D:\\FULL STACK DEV USING JAVA\\Bhanu\\sea1.jpg");
	   FileWriter fw = new FileWriter("D:\\FULL STACK DEV USING JAVA\\Bhanu\\sea4.jpg");
	   System.out.println("Connection created");
	   int i;
	   while((i=rd.read())!=-1)
	   {
		   fw.write(i);;
	   }
	   System.out.println("\nData retrieved");
	   rd.close();
	   
   }
   
   public static void main(String[] args) throws Exception
   {
	  ClassCharacterStreams ccs=new ClassCharacterStreams();
	 // ccs.fileOperations1();
	  //ccs.fileOperations2();
	  ccs.fileOperations3();
   }
}

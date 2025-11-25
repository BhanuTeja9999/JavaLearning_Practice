package IOStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 *            |->InputStream->FileInputStream ->read() -->return type is int.Returns ASCII values of the characters
 * Byte Streams
 *            |->OutputStream->FileOutputStream ->write()
 *                                                 |
 *                                                 |(accepts)
 *                                        -------------------- 
 *                                        |                   |
 *                                        ↓                   ↓
 *                                        int               byte Array
 */

public class ClassByteStreams
{
 void fileOperations1() throws Exception  //Reading the data from the file and displaying it on the console.
 {
	 System.out.println("Reading the data from the file \n");
	 FileInputStream fis = new FileInputStream("D:\\FULL STACK DEV USING JAVA\\Bhanu\\file1.txt");
	 System.out.println("Connection created");
	 int i;
	 while((i=fis.read())!=-1)
	 {
		 System.out.print((char)i);
	 }
	 System.out.println("\n\nData Retrieved");
	 fis.close();
 }
 void fileOperation2() throws Exception //writing user given text data into the file and also appending to
                                        //existing data
         
 {
	 System.out.println("Writing the data into the file");
	 FileOutputStream fos = new FileOutputStream("D:\\\\FULL STACK DEV USING JAVA\\\\Bhanu\\\\file2.txt",true);//append mode ==>true
	 System.out.println("Connection created"); 
	 String data= " and also a web developer";
	 byte arr[]=data.getBytes();
	 
	 fos.write(arr);
	 
	 System.out.println("Data entered");
	 fos.close();
 }
 void fileOperations3() throws Exception //copying the text content of file2.txt to file3.txt
 {
	 FileInputStream fis = new FileInputStream("D:\\FULL STACK DEV USING JAVA\\Bhanu\\file2.txt");
	 FileOutputStream fos = new FileOutputStream("D:\\\\FULL STACK DEV USING JAVA\\\\Bhanu\\\\file3.txt",true);
	 int i;
	 while((i=fis.read())!=-1)
	 {
		 fos.write((char)i);
	 }
	 
 }
 
 void fileOperations4() throws Exception //Copying a image file content and creating an exact copy of it.
 {
	FileInputStream fis= new FileInputStream("D:\\FULL STACK DEV USING JAVA\\Bhanu\\sea1.jpg"); 
	FileOutputStream fos = new FileOutputStream("D:\\\\FULL STACK DEV USING JAVA\\\\Bhanu\\\\sea2.jpg");
	System.out.println("Connection created");
	int i;
	
	while((i=fis.read())!=-1)
	{
		fos.write(i);
	}
 }
 
 public static void main(String[] args) throws Exception
 {
	 ClassByteStreams aobj=new ClassByteStreams();
	//aobj.fileOperations1();
	//aobj.fileOperation2();
 	aobj.fileOperations3();
 	aobj.fileOperations4();
 }
}

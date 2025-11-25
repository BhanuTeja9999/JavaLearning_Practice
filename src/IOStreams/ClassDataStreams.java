package IOStreams;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*              /->DataInput=> DataInputStream=> FileInputStream(source)
 *             /
 * DataStreams-
 *             \
 *              \->DataOutput => DataOutputStream => FileOutputStream(source)
 */
public class ClassDataStreams
{
   
	void fileOperations() throws Exception
	{
		System.out.println("Implementing DataStreams\n");
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("D:\\FULL STACK DEV USING JAVA\\Bhanu\\Filee1.txt"));
		dos.writeInt(1000);
		dos.writeChar('A');
		dos.writeBoolean(true);
		dos.writeInt(2000);
		System.out.println("Data entered Securely!!!");
		dos.close();
		
		DataInputStream dis = new DataInputStream(new FileInputStream("D:\\FULL STACK DEV USING JAVA\\Bhanu\\Filee1.txt"));
	    System.out.println("Connection created");
	    System.out.println(dis.readInt());
	    System.out.println(dis.readChar());
	    System.out.println(dis.readBoolean());
	    System.out.println(dis.readInt());
	   
	    /**
	     * In data Streams we need to maintain the order i.e in which order
	     * we have entered the data ,in the same order we need to retrieve 
	     * otherwise we will be getting inconsistent results
	     */
	    System.out.println("\nData Retrieved");
	    dis.close();
	}
	public static void main(String[] args)throws Exception
	{
	   ClassDataStreams cds = new ClassDataStreams();
	   cds.fileOperations();
	}
}
	 

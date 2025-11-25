package IOStreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;


public class ClassObjectStreamsImple
{
  public static void main(String[] args) throws Exception
  {
	 System.out.println("Implementing Serialization\n");
	 ClassObjectStreams cos = new ClassObjectStreams();
	 ClassObjectStreams2 cos2 = new ClassObjectStreams2();
     System.out.println(cos.a+ " "+cos.b);
     System.out.println(cos2.x+" "+cos2.y);
     /*
      * FileOutput means java program output to file 
      */
     ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\FULL STACK DEV USING JAVA\\Bhanu\\data.ser"));
     System.out.println("Connection created ");
     oos.writeObject(cos);
     oos.writeObject(cos2);
     System.out.println("Serialization completed");
     oos.close();
     
     System.out.println("\nDeserialization  started \n");
     ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\\\FULL STACK DEV USING JAVA\\\\Bhanu\\\\data.ser"));
     ClassObjectStreams cos3 = (ClassObjectStreams)ois.readObject();
	 ClassObjectStreams2 cos4 = (ClassObjectStreams2)ois.readObject();
	 
	 System.out.println(cos3.a + " "+ cos3.b);
	 System.out.println(cos4.x + " "+ cos4.y);
	 ois.close();
  }
}

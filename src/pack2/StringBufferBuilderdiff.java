package pack2;

public class StringBufferBuilderdiff
{
   void meth1()
   {
	   int iterations = 100000;
	   String data = "a";
	   long startTime = System.currentTimeMillis();
	   String str = "";
	   for(int i=0;i<iterations;i++)
	   {
		   str+=data;
	   }
	   long endTime = System.currentTimeMillis();
	   long StringDuration = endTime - startTime;
	   
	   startTime = System.currentTimeMillis();
	   StringBuffer stringBuffer = new StringBuffer();
	   for(int i=0;i<iterations;i++)
	   {
		   stringBuffer.append(data);
	   }
	   endTime = System.currentTimeMillis();
	   long stringBufferDuration = endTime-startTime;
	   
	   startTime=System.currentTimeMillis();
	   StringBuilder stringBuilder = new StringBuilder();
	   for(int i =0 ;i<iterations;i++)
	   {
		   stringBuilder.append(data);
	   }
	   endTime = System.currentTimeMillis();
	   long stringBuilderDuration = endTime-startTime;
	   
	   
	   System.out.println("Time taken for string concatenation : "+StringDuration+" ms");
	   System.out.println("Time taken for StringBuffer concatenation : "+stringBufferDuration+ " ms");
	   System.out.println("Time taken for StringBuilder concatenation :"+stringBuilderDuration+ " ms");
	   
   }
   public static void main(String[] args) {
	new StringBufferBuilderdiff().meth1();
}
}

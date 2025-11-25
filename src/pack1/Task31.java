package pack1;

public class Task31 
{
	public int countCode(String str)
	{   
		str=str.toLowerCase();
		int count=0;
		for(int i=0;i<=str.length()-4;i++)
		{
			if(str.substring(i,i+2).equals("co")&&str.charAt(i+3)=='e')
			{
			   System.out.println("Last index : "+(i+3));
			   ++count;
			}
	    }
		return count;
	}

   public static void main(String[] args) 
   {
	  int c=new Task31().countCode("Cozeabcabcccope");
	  System.out.println(c+ " times ");
   }
}

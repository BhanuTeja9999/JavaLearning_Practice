package pack1;
/*
 * Given a string, return true if the first 2 chars in the string 
 * also appear at the end of the string, such as with "edited".
       frontAgain("edited") ? true
       frontAgain("edit") ? false
       frontAgain("ed") ? true
 */
public class Task33 
{
	public boolean frontAgain(String str)
	{
	  int len =str.length();
      if(str.substring(0,2).equals(str.substring(len-2)))
	    return true;
      return false;
	 
	}
   public static void main(String[] args) 
   {
	   boolean flag=new Task33().frontAgain("edited");
	   System.out.println(flag);
   }
}

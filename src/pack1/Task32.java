package pack1;

public class Task32
{

  public String makeOutWord(String out, String word)
  {
	 
	String op=out.substring(0,2)+word+out.substring(2,4);
	return op;
  }
  
  public static void main(String[] args)
  {
	  String output=new Task32().makeOutWord("[[]]", "Bhanu");
	  System.out.println(output);
  }
}

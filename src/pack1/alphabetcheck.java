package pack1;

public class alphabetcheck {

	void check(char c)
	{
	   if(c>=97 && c<=122)
	   {
		   System.out.println(c +"is a lowercase letter");
	   }
	   if(c>=65 && c<=90)
	   {
		   System.out.println(c +" is a uppercase letter");
	   }
	}
	public static void main(String[] args) {
		new alphabetcheck().check('f');
	}
}

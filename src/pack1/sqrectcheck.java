package pack1;

public class sqrectcheck

{
	void check(int len,int bred)
	{
		if(len==bred)
		{
			System.out.println("It is a square");
		}
		else
		{
			System.out.println("It is a rectangle");
		}
	}
    public static void main(String[] args) {
    	new sqrectcheck().check(5,5);
		
	}
}

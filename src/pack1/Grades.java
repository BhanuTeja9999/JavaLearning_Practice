package pack1;

public class Grades {
    void checkgrade(int marks)
    {
    	if(marks<25 && marks>0)
    	{
    		System.out.println("Your grade is : F");
    	}
    	else if(marks>=25 && marks<45)
    	{
    		System.out.println("Your grade is : E");
    	}
    	else if(marks>=45 && marks<50)
    	{
    		System.out.println("Your grade is : D");
    	}
    	else if(marks>=50 && marks<60)
    	{
    		System.out.println("Your grade is : C");
    	}
    	else if(marks>=60 && marks<80)
    	{
    		System.out.println("Your grade is : B");
    	}
    	else if(marks>80)
    	{
    		System.out.println("Your grade is : A");
    	}
    	else
    	{
    		System.out.println("Enter your marks properly (-ve is not allowed)");
    	}
    }
    public static void main(String[] args) {
		new Grades().checkgrade(-9);
	}
}

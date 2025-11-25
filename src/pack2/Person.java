package pack2;

public class Person 
{
   String name;
   Person()
   {
	 this("Abdul Kalam Sir");
	 this.display();
   }
   Person(String name)
   {
	   this.name=name;
   }
   void display()
   {
	   System.out.println("Person name is : "+name);
   }
   public static void main(String[] args) {
	new Person();
}
}

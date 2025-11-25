package generictest01;
//Representing a pair of objects with generic type parameters
public class Pair<A,B>
{
  A first;
  B second;
  public Pair(A a,B b)
  {
	  first =a;
	  second = b;
  }
  
  public A getFirst()
  {
	  return first;
  }
  
  public B getSecond()
  {
	  return second;
  }
  public static void main(String[] args) {
	Pair<String,Double> bid;
	bid = new Pair<>("ORCL",32.07);
	//bid = new Pair<String,Double>("ORCL", 32.07);
	//bid = new Pair("ORCL", 32.07);
	
	String stock = bid.getFirst();
	double price = bid.getSecond();
	System.out.println("Stock : "+stock+" Price :"+price);
} 
}

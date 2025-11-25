package pack1;

public class Obj {

	public static void main(String[] args) {
		Obj o1=new Obj();
		Obj o2=new Obj();
		System.out.println("o1: "+o1.hashCode());
		System.out.println("o2: "+o2.hashCode());
		System.out.println(new Obj().equals(o2));
		
		System.out.println(o1.equals(o2));
		System.out.println(o2.equals(o2));
		System.out.println(new Obj().equals(new Obj()));
	}
}

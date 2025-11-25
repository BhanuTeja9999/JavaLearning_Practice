package pack1;

public class GETCLASSM {
	void meth1()
	{
		System.out.println("meth1() called");
	}
	protected void finalize()
	{
		 System.out.println("Garbage collected");
	}
	public static void main(String[] args) {
		GETCLASSM gm = new GETCLASSM();
		GETCLASSM gm1 = new GETCLASSM();
		System.out.println("gm: "+gm.getClass());
		gm1 = null;
		System.out.println("gm: "+gm.toString());
		System.gc();
	  	
	}

}

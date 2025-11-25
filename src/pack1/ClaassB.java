package pack1;

public class ClaassB 
{
	
	void methB()
	{
		System.out.println("ClaassB methB() {default} called");
	}
   public static void main(String[] args) {
	ClaassA1 aobj = new ClaassA1();
	aobj.meth1(); //here we are calling ClaassA1 method which is declared as protected.
	//aobj.meth2();//meth2 is declared as private.It is restricted to ClaassA1 class only.
	
}
}

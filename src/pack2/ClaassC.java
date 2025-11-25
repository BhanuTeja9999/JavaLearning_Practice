package pack2;

import pack1.ClaassA1;
//Linked programs are present in pack1
//This ClaassC belongs to Access Modifiers program
public class ClaassC extends ClaassA1
{
    public static void main(String[] args) {
    	//ClaassA1 aobj = new ClaassA1();
        //aobj.meth1();
    	//We will get an C.T.E becoz we can access the
    	//protected method of ClaassA1(parent) with
    	//child class reference only.
    	
    	
    	ClaassA1 aobj1 = new ClaassC();
    	//Child class object with parent class reference is also not possible
    	//aobj1.meth1(); will give you a compile time error
    	
    	
    	
    	//child class object with child class reference 
    	//Then only it is possible
		ClaassC cobj = new ClaassC();
		cobj.meth1();

	}
}

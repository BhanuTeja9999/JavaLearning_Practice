package pack2;

public class EnCap1
{
    private String empName;
    private int empId;
    private int empSal;
    private int empExp;
    
    public String getEmpName()
    {
    	return empName;
    }
    
    public int getEmpId()
    {
    	return empId;
    }
    public int getEmpSal()
    {
    	return empSal;
    }
    public int getEmpExp()
    {
    	return empExp;
    }
    
    public void setEmpName(String empName)
    {
    	this.empName=empName;
    }
    public void setEmpSal(int empSal)
    {
    	this.empSal=empSal;
    }
    public void setEmpId(int empId)
    {
    	this.empId=empId;
    }
    public void setEmpExp(int empExp)
    {
    	this.empExp=empExp;
    	if(empExp>=5)
    	{
    		this.empSal+=this.empSal*0.3;
    	}
    	else
    	{
    		this.empSal+=10000;
    	}
    }


    
}

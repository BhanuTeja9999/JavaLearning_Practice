package Collections;

public class Employee implements Comparable<Employee>
{
  private String empName;
  private int empId;
  private String empDept;
  
  
  public Employee(String empName,int empId,String empDept)
  {
	  this.empDept=empDept;
	  this.empId=empId;
	  this.empName=empName;
  }
  public String getEmpName() 
  {
	return empName;
  }
  public int getEmpId()
  {
	return empId;
  }
  public String getEmpDept()
  {
	return empDept;
  }
@Override
public String toString() {
	return "Employee [empName=" + empName + ", empId=" + empId + ", empDept=" + empDept+"]";
}

@Override
public int compareTo(Employee o) {
	// TODO Auto-generated method stub
	return empDept.compareTo(o.empDept);
    }
}

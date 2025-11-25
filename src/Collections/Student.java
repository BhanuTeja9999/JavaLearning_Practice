package Collections;

public class Student 
{
   private String studentName;
   private int studentMarks;
   private String studentBranch;
   
   public Student(String studentName,int studentMarks,String studentBranch)
   {
	   this.studentName=studentName;
	   this.studentMarks = studentMarks;
	   this.studentBranch=studentBranch;
   }
   @Override
   public String toString()
   {
	   return studentName + " "+ studentMarks + " "+studentBranch;
   }
}

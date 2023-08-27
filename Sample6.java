 class Student
 {
  int rollno = 20;
  String name = "Tanvi";
  
  protected void finalize()
  {
   System.out.println("The Finalize method is executed");
  }
 }
 
 public class Sample6
 {
  public static void main(String args[])
  {
	  
	Student s1 = new Student();
	
	
   System.out.println("Roll No :" +s1.rollno);
   System.out.println("Name : " +s1.name);
   
   
   s1 = null;
   System.gc();
  }  
 }
 
  
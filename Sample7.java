 class Student
 {
  int rollno ;                // instance variable
  String name;                // instance variable
  static String branch;       // static variable
  
  public void getData(int r,String n, String b)    // Local variable
  {
   rollno = r;
   name = n;
   branch = b;
  }
 }
 
 public class Sample7
 {
  public static void main(String args[])
  {
	  
   Student s1 = new Student();
   s1.getData(13, "Tanvi" , "CSE");
   
   System.out.println("Roll No : " +s1.rollno);
   System.out.println("Name : " +s1.name);
   System.out.println("Branch : " +s1.branch);
   

  }
  
 }
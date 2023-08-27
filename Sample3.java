 class Student
 {
  int rollno = 20;
  String name = "Tanvi";
  
  Student()                                        //Default Constructor
  {
   System.out.println("Roll Number : " +rollno);
   System.out.println("Name : " +name);
  }
 }
 
 public class Sample3
 {
  public static void main(String args[])
  {
   Student s1 = new Student();
  }
 }
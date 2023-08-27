class Student
{
 int rollno ;
 String name ;
 
 public void getData(int rollno, String name)
 {
  this.rollno = rollno;
  this.name = name;
 }
}

public class Sample8
{
 public static void main(String args[])
 {
  Student s1 = new Student();
  s1.getData(26,"Tanvi");
  
  System.out.println("Roll No : " +s1.rollno);
  System.out.println("Name : " +s1.name);
 }
}
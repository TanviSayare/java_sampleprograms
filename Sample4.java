 class Student
 {
  int rollno ;
  String name ;
  
  Student(int r,String n)            //Parameterised Constructor
  {
   rollno = r;
   name = n;
  }
  
  void display()
  {
   System.out.println("Roll Number : " +rollno);
   System.out.println("Name : " +name);
  }
 }
 
  public class Sample4
  {
   public static void main(String args[])
   {
    Student s1 = new Student(1,"Tanvi");
	s1.display();
	
    Student s2 = new Student(2,"Aditya");
	s2.display();
   }
  }
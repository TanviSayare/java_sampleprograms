 class Student
 {
  int rollno;
  String name;
  
  Student()                                        // Default constructor
  {
   rollno = 5;
   name = "Tanvi";
  }
  
  Student(int r,String n)                          // Parameterised Constructor
  {
   rollno = r;
   name = n;
  }
  
  void display()
  {
   System.out.println("Roll No : " +rollno);
   System.out.println("Name : " +name);
  }
  
  }
  
  public class Sample5
  {
   public static void main(String args[])
   {
    Student s1 = new Student();
	s1.display();
	
	Student s2 = new Student(5,"Aditya");
	s2.display();
   }
  }
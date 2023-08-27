class Student
{
 int rollno = 10;                                      //Data members
 String name = "Tanvi";                                   //Data members
 
  void display()                                       // Method
  {
   
   System.out.println("Roll Number :" +rollno);
   System.out.println("Name :" +name);
   
  }
}

 public class Sample
 {
	 public static void main(String args[])
	 {
       Student s1;                                        // Object declared 
	   s1 = new Student();                        // object created
	   s1.display();                                      // method called
	 }
 }
 
 
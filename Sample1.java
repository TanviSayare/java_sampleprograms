class Student
{
 int rollno ;
 String name ;
  
  void getData(int r,String n)
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

 public class Sample1
 {
   public static void main(String args[])
   {
     Student s1 = new Student();
	 Student s2 = new Student();
	 Student s3 = new Student();
	 
	 s1.getData(1,"Tanvi");
	 s1.display();
	 
	 s2.getData(2,"Aditya");
	 s2.display();
	 
	 s3.getData(3,"Krushnai");
	 s3.display();
   }
 }
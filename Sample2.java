class Sum 
{
 int add(int a,int b,int c)
 {
 return(a+b+c);
 }
 
 float add(float a,float b)
{
 return(a+b);
}

 double add(double a, double b)
 {
 return(a+b);
 }
 
}

public class Sample2
{
 public static void main(String args[])
 {
   Sum s1 = new Sum();
   System.out.println(s1.add(4,5,6));
   
   Sum s2 = new Sum();
   System.out.println(s2.add(4.5,5.0));
   
   Sum s3 = new Sum();
   System.out.println(s3.add(1.2,1.6));
 }
}
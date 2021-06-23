abstract class shape 
{
  abstract double area();
  abstract double circumference();

    
}
  class azz extends shape{

   @Override double area()
   {
      double a;
      int r=2;
      a=3.14*r*r;
      System.out.println("area of circle: "+a);
      return(a);
   }
   @Override double circumference()
   {
      double c;
      int r=4;
      c=2*3.14*r;
      System.out.println("circumference of the circle : "+c);
      return(c);

   }
}
 
 class rectangle extends shape{

    @Override double area()
    {
       double a;
       int b=2;
       int l=3;
       a=l*b;
       System.out.println("area of rectangle: "+a);
       return(a);
    }
    @Override double circumference()
    {
       double c;
       int b=4;
       int l=2;
       c=2*(l+b);
       System.out.println("circumference of the circle : "+c);
       return(c);
 
    }
 }
 public class abs{
    public static void main(String[]args)
    {
        shape a;
        a=new azz();
        a.area();
        a.circumference();
    
    
    shape b;
    b=new rectangle();
    b.area();
    b.circumference();
}
 }

 
  
 
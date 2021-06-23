package calculator;

public class calculator {
    
    
  public int add (int  x , int y)
    {
        return x+y;
    }
    public float add ( float f1, float f2)
    {
        return f1+f2;
    }
    public double add (double x , double y)
    {
        return x+y;
    }
    public  int sub (int x , int y)
    {
        return x-y;
    }
    public float sub ( float f1, float f2)
    {
        return f1-f2;
    }
    public double sub (double x , double y)
    {
        return x-y;
    }
    public int mul ( int x , int y)
    {
        return x*y;
    }
    public float mul ( float f1, float f2)
    {
        return f1*f2;
    }
    public double mul (double x , double y)
    {
        return x*y;
    }
    public float div (float f1 , float f2)
    {
        return f1/f2;
    }
    public int div ( int x , int y)
    {
        return x/y;
    }
    public double div (double x , double y)
    {
        return x/y;
    }


    public static void main(String[]args)
    {
        calculator a=new calculator();
      int z=a.add(3, 3);
     int c=a.sub(3, 3);
      int d=a.mul(3, 3);
      float e=a.div(3.1f, 3.2f);
      float f=a.add(2.7f, 4.5f);
      float f1=a.sub(2.7f, 4.5f);
      float f2=a.mul(2.7f, 4.5f);
      int f3=a.div(2, 4);
      double d0 = a.add(10000, 50000);
      double d1=a.sub(4576398, 66987);
      double d2 = a.mul(10000, 50000);
      double d3=a.div(4576398, 66987);
        System.out.println("the addition of two numbers "+z);
        System.out.println("the addition of two numbers "+f);
        System.out.println("the addition of two numbers "+d0);
        System.out.println("the subraction of two numbers "+c);
        System.out.println("the subraction of two numbers "+f1);
        System.out.println("the subraction of two numbers "+d1);
        System.out.println("the multiplication of two numbers "+d);
        System.out.println("the multiplication of two numbers "+f2);
        System.out.println("the multiplication of two numbers "+d2);
          System.out.println("the division of two numbers "+e);
        System.out.println("the division of two numbers "+f3);
        System.out.println("the division of two numbers "+d3);

    }
   

    }  
    

class mynewCalci
{

}
class justice
{   
    void beep()
   {
    System.out.println("batman");
    }
}
class superman extends justice
{
    void beep()

 {
    System.out.println("aquaman");
  
 }
}
public class overriding {
   public static void main(String[]args)
   {
      superman j=new superman();
      j.beep();
   
   }
   
}

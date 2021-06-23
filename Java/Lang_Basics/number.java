public class number {
   public static int funct(int n1, int n2)
    {
      int min;
      if (n1 > n2)
         min = n2;
      else
         min = n1;

      return min;
   }

   public static void main(String[] args) {
      ;
      number n=new number();
     ;
      System.out.println("Minimum Value = " + n.funct(11,6));
   }


   
}

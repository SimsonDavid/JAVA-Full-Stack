public class overriding2 {
     
    public static void main(String[]args)
    {
        add a;
        a=new asap();
        a.samp();
        a=new fifo();
        a.samp();
    }
}
 class add 
 {
     void samp()
     {
         System.out.println("Sorry you are fired");
     }
 }
 class asap extends add
 {
     void samp()
     {
         System.out.println("welcome back ");

     }
 }
 class fifo extends add
 {
     void samp()
     {
         System.out.println("iron man");
     }
 }
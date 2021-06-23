import java.util.*;
public class mytest
{

    int studentid;
    String studentname; 

    public void setsid(int sid)
    {
        
     Scanner s=new Scanner();
      System.out.println("enter id:");
s.nextInt();
        
       
    }
    public int getsid()
    {
        System.out.println("id "+this.studentid);
        return this.studentid;
    }
    public void setsname(String sname)
    {
        this.studentname=sname;

    }
    public String getsname()
    {
        return this.studentname;
    }
    
    public static void main(String [] args)
    {
   
   mytest m=new mytest();
   m.setsid();
   m.getsid();
   
   

}
}

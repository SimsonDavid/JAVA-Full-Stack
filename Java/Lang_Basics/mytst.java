public class encap
{

    int studentid;
    String studentname; 

    public void setsid(int sid)
    {
        
       this.studentid=sid;
        
       
    }
    public int getsid()
    {
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
   
   mytst m=new mytst();
   m.setsid(10);
   int s1id=m.getsid();
   System.out.println("sid ="+s1id);
   m.setsname("Simson ");
   String s1name=m.getsname();
   System.out.println("student name "+s1name);

   mytst m2=new mytst();
   m2.setsid(11);
   int s2id=m.getsid();
   System.out.println("sid =" +s2id);
   m2.setsname("david");
   String s2name=m.getsname();
   System.out.println("student name " +s2name);
  
   

}
}

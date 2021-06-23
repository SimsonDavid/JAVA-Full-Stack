class parent
{
    int v=3;
    public void print()
    {
        System.out.println(v);
    }

}
class child extends parent{
    public void print()
    {
       
        System.out.println();
    }
}
public class inherit2
{
    public static void main(String [] args)
    {
        child c=new child();
        System.out.println(" the value of v is:");
        c.print1();
    }
}
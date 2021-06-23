import java.util.*;
public class list{
    public static void main(String[]args)
    {
     List<String> s= new ArrayList<>();
     s.add("abcd");
     s.add("efgh");
     s.add("ijkl");
     s.add("mnop");
     s.add("qrst");
     s.add(1,"uvwx");
     s.add("yz");
     System.out.println(s);
     s.remove("mnop");
     s.remove(1);
     System.out.println(s);









    }
}
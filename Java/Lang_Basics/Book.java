import java.util.*;
public class Book {
    int bookid;
    String bookname;
    String ISBN;
    String Author;

    public void setbookid(int bid)
    {
        this.bookid = bid;
    }

    int getbookid()
    {
        return this.bookid;
    }
   public  void setbookname(String bn)
    {
        this.bookname=bn;
    }
    String getbookname()
    {
        return this.bookname;
    }
   public void setisbn(String isb)
    {
        this.ISBN=isb;
    }
    String getisbn()
    {
        return this.ISBN;
    }
   public void setauthor(String auth)
    {
        this.Author=auth;
    }
    String getauthor()
    {
        return this.Author;
    }
    public static void main(String[]args)

    {
         Book  b1 = new Book();
         Book  b2 = new Book();
         Book  b3 = new Book();

        b1.setbookid(10001);
        b1.setbookname("Going for Water");
        b1.setisbn("N001E");
        b1.setauthor("Robert brown");

        b2.setbookid(10002);
        b2.setbookname("Batman Begins");
        b2.setisbn("N002E");
        b2.setauthor("James");

        b3.setbookid(10003);
        b3.setbookname("Newton Law");
        b3.setisbn("N003E");
        b3.setauthor("Bharath");

        System.out.println("The book id is :"+b1.getbookid());
        System.out.println("The book Name is :"+b1.getbookname());
        System.out.println("The book ISBN is :"+b1.getisbn());
        System.out.println("The book Author is :"+b1.getauthor());

        System.out.println("\n"+"The book id is :"+b2.getbookid());
        System.out.println("The book Name is :"+b2.getbookname());
        System.out.println("The book ISBN is :"+b2.getisbn());
        System.out.println("The book Author is :"+b2.getauthor());

        System.out.println("\n"+"The book id is :"+b3.getbookid());
        System.out.println("The book Name is :"+b3.getbookname());
        System.out.println("The book ISBN is :"+b3.getisbn());
        System.out.println("The book Author is :"+b3.getauthor());



        
    } 
}

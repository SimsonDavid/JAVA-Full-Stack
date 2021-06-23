import java.util.*;
public class Odd {
    public static void main(String[]args){
        int j=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number : ");
        j=s.nextInt();

        for(int i=1;i<=j;i++){

        
       int m=i%2;
       if(m!=0){
           System.out.println(i+ "this is a odd number");
       }
    }
       
    }
    
}

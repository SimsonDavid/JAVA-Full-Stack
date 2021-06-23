import java.util.*;
public class strrrr {
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        String str = new String("");
        String str1 = new String("");
        System.out.println("enter the word : ");
        str=s.next();
        int n = str.length();
        for(int i=1;i<=n;i++){
            str1=str1+str.charAt(n-i);
      
        }
        if(str.equals(str1)){
    System.out.println("it is a palindrome");
        }
    else
         System.out.println("not a palindrome");
    }
    
}

import java.util.*;

public class Oddprime {
    public static void main(String[]args){
        int j=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number : ");
        j=s.nextInt();
        for(int i=1;i<=j;i++){
            int m=i%2;
            if(m>0 || m!=0){
                System.out.println(i+ "this is a odd number");
                // int n=i/2,l=2;
                //     if(l<=n && (i%l) !=0)
                //         System.out.println(i+ "this is prime");

            }

        }
    }
    
}

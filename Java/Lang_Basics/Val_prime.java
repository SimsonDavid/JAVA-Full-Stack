import java.util.Scanner;
public class Val_prime {
    public static void main(String[]args){
        int i=0;
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number ");
        i=s.nextInt();
            int m=i/2,l=2;
           if(m==0||m==1){
            System.out.println("the prime number is "+i);
           }
                if(l<=m){
                if(i%l==0){
                    System.out.println("this is not prime number : "+i);
                }else{
                    System.out.println("the prime number is "+i);
                }
            }
        }

    
  
    
}

import java.util.Scanner;

public class StarSample {
    public static void main(String[]args)
    {  
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = sc.nextInt();
        for(int i =0;i<n;i++){
            for(int j =0;j<=n-i;j++)
            {
             System.out.print(" ");
            }
            for(int k =0;k<=i;k++)
            {
                
                System.out.print(" *");
                //System.out.print(" "+((factorial(i)/(factorial(i-k)*factorial(k)))));
            }

                System.out.print("\n");}
        }
        // private static int factorial(int i){
        //     if(i>0){ 
        //     return i*factorial(i-1);
        //     }
        //  else
        //     return 1;
        // }
        
    }


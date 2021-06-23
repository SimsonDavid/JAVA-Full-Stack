public class avg {
    public static void main(String[]args){
       float n=6,avg;
       int b=0;
       int a[]= new int []{1,2,3,4,5,6};
       a[0]=10;
       a[1]=48;
       a[2]=37;
       a[3]=75;
       a[4]=65;
       a[5]=70;
       for(int i=0;i<=5;i++){
         b= a[i]+b;

       }

    //    avg=a[0]+a[1]+a[2]+a[3]+a[4]+a[5]/n;
    avg=b/n;
       System.out.println("average is "+avg);



    }
    
}

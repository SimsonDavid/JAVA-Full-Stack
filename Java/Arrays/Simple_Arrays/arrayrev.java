public class arrayrev {
    
    public static void main(String args[]){
        int a[] =new int[]{1,2,3,4,5,6,7};
      //  int len= a.length;
        int len=a.length-1;
           a[0]=1;
           a[1]=2;
           a[2]=3;
           a[3]=4;
           a[4]=5;
           a[5]=6;
           a[6]=7;
           for(int i=len;i>=1;i--){

           System.out.println(a[i]);
       }
    }
  }

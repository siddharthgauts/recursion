package recursion;

public class fibo {
//f1=1,f2=1,f3=2,f4=3,f5=5,f6=8,f7=13,f8=21,f9=34,f10=55,f11=89

    public  static int  fibon(int n){
        if(n==1 || n==0){
            return n;
        }
        int fnm1= fibon(n-1);
         int fnm2= fibon(n-2);
         int fibosum= fnm1+fnm2;
         return fibosum;
    }
    public static void main (String args[]){
     System.out.println(fibon(45));
    }
    
}

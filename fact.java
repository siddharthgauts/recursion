package recursion;

public class fact {
    
    public static int fact(int n){
       if(n==0){
        return 1;
       }
        int fac =fact(n-1);
        int fn= n*fac;
        return fn;
    }

    public static void main(String args[]){
        int n=5;
        System.out.println(fact(n));
    }
}

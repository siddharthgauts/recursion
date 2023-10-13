package recursion;

public class sumofn {
    
    public static int calsum(int n){
        if(n==1){
            return n;
        }
        int sum=calsum(n-1);
        int sm= n + sum;
         return sm;
    }

    public static void main(String args[]){
         int n=5;
        System.out.println(calsum(n));
    }
}

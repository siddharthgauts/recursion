package recursion;

public class printindecAec {
    

    //print in decending order
    public static void printDec(int n){
        if(n==1){
            System.out.println(n);
        return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
     //print in Aes order
     public static void printAec(int n){
        if(n==10){
            System.out.println(n);
        return;
        }
        System.out.print(n+" ");
        printAec(n+1);
    }
 ///             OR          ///
    public static void printAcen(int n){
        if(n==1){
            System.out.print(1+" ");
        return;
        }
        printAcen(n-1); // pahle 1 print hoga then 2,3,4,5,...
        System.out.print(n+" ");
    }

    public static void main(String args[]){
        int n=10;
        int k=1;
        printDec(n);
        printAec(k);
        printAcen(n);
    }
}

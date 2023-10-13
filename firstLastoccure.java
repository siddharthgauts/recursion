package recursion;

public class firstLastoccure {

    public static int  firstOc(int arr[],  int key, int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
    return  firstOc(arr, key, i+1);
      }

      public static int lastOc(int  arr[],  int key, int i){
        if(i==arr.length){
            return -1;
        }
        int isFound = lastOc(arr, key, i+1);
        if(isFound==-1&& arr[i]==key){
            return i;
        }
        return isFound;
      }

      public static  void main(String args[]){
        int arr[]={8,3,5,6,5};
        System.out.println(firstOc(arr,5,0));
        System.out.println(lastOc(arr,5,0));
      }
}

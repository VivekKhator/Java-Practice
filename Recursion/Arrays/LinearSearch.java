package Arrays;

public class LinearSearch {

    static int linearSearch(int[] arr, int t){
        return helper(arr, t, 0);
    }

    static int helper(int[] arr, int t, int i){

        if(arr[i]==t){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }

        return helper(arr,t,i+1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,7,9,6,8};
        int target = 97;

        System.out.println("Index: "+linearSearch(arr, target));
    }
}

package Arrays;

import java.util.Scanner;

public class SortedOrNot {

    public static boolean isSorted(int[] arr){
        return helper(arr, 0);
    }
    
    public static boolean helper(int[] arr, int s){
        if(s==arr.length-1){
            return true;
        }
        return arr[s]<arr[s+1] && helper(arr, s+1);
    }
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }

        int[] arr = new int[]{1,2,4,5,6,7};
        System.out.println(isSorted(arr));
    }
}

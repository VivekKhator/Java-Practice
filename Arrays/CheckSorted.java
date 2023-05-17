package Arrays;
import java.util.Scanner;

public class CheckSorted {

    static boolean isSorted(int[] arr, int n){

        for(int i=1; i<n; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        if(isSorted(a,n)){
            System.out.println("Array is Sorted");
        }
        else{
            System.out.println("Array is not Sorted");
        }

    }
}

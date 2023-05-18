package Arrays;
import java.util.*;

public class MovesZeroes {

    static void moveArray(int[] arr, int n){

        int i=0;
        for(int j=0; j<n; j++){
            if(arr[j]!=0){
                arr[i] = arr[j];
                i++;
            }
        }

        for(int j=i; j<n; j++){
            arr[j] = 0;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        moveArray(a,n);
        System.out.println(Arrays.toString(a));
    }
}

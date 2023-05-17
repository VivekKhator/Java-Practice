package Arrays;

import java.util.*;

public class RotateArray {
    
    static int[] rotateArray(int[] a, int n, int k){

        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[(i+k)%n] = a[i];
        }

        for(int i=0; i<n; i++){
            a[i] = arr[i];
        }

        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        int k = in.nextInt();
        
        System.out.println(Arrays.toString(rotateArray(a,n,k)));
    }
}

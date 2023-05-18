package Arrays;
import java.util.*;

public class MissingNumber {

    static int missingNumber(int[] a, int n, int N){

        int sum = (N*(N+1))/2;
        for(int i : a){
            sum -= i;
        }

        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        int N = n+1;

        System.out.println(missingNumber(a, n, N));

    }
}

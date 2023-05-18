package Arrays;
import java.util.*;

public class RemoveDuplicates {

    static int removeDuplicates(int[] a, int n){

        int i=0;
        for(int j=1; j<n; j++){
            if(a[i]!=a[j]){
                a[i+1] = a[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        int limit = removeDuplicates(a,n);
        for(int i=0; i<limit; i++){
            System.out.println(a[i]);
        }
    }
}

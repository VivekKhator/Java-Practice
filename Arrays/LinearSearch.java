package Arrays;
import java.util.Scanner;

public class LinearSearch {

    static int linear(int[] a, int n, int num){
        for(int i=0; i<n; i++){
            if(a[i] == num){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        int num = in.nextInt();

        if(linear(a, n, num)>-1){
            System.out.println("Element found at "+linear(a,n,num));
        }
        else{
            System.out.println("Element haven't found");
        }
    }
}

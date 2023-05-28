import java.util.Scanner;

public class Sum1toN {
    
    public static long sum1toN(int n){

        if(n==0){
            return 0;
        }

        return n+sum1toN(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(sum1toN(n));
    }
}

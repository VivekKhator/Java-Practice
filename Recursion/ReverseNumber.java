import java.util.Scanner;
import java.lang.Math;
import java.lang.*;

public class ReverseNumber {
    
    static int sum = 0;
    public static void reverse1(int n){
        /* Way-1 */

        if(n==0){
            return;
        }
        int i = n%10;
        sum = sum*10+i;
        reverse1(n/10);
    }


    static int reverse2(int n){

        int digit = (int)(Math.log10(n))+1;
        return helper(n,digit);
    }

    static int helper(int n, int d){

        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10,d-1))+helper(n/10,d-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(reverse2(n));
    }
}

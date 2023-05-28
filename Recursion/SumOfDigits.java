import java.util.Scanner;

public class SumOfDigits {
    
    public static long sumOfDigits(long n){

        if(n==0){
            return 0;
        }
        int i = ((int)n)%10;
        n = n/10;
        return i + sumOfDigits(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(sumOfDigits(n));
    }
}

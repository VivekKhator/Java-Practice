package Basic_Problems;
import java.util.Scanner;

public class FindGCD {
    public static void main(String[] args) {
        
       /* 
        You are given two numbers. You need to calculate and 
        print their greatest common divisor (GCD). 
       */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int small = a<b?a:b;
        
        for(int i=small; i>0; i--){
            if(a%i==0 && b%i==0){
                System.out.println("GCD: " +i);
                break;
            }
        }
    }
}

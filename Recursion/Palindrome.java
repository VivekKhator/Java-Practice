import java.util.Scanner;

public class Palindrome {
    
    static int reverse(int n){

        int digits = (int)Math.log10(n);
        return helper(n, digits);
    }

    static int helper(int n, int digits){
        if(n%10==n){
            return n;
        }
        int rem = n%10;
        return rem*(int)(Math.pow(10, digits))+helper(n/10,digits-1);
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if(n==reverse(n)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        
    }
}

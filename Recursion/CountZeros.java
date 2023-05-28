import java.util.*;

public class CountZeros {

    static int count=0;
    static void count(int n){
        
        if(n%10==n){
            return;
        }
        int rem = n%10;
        if(rem==0){
            count++;
        }
        count(n/10);
    }

    static int count2(int n){
        return helper(n, 0);
    }

    static int helper(int n, int c){

        if(n==0){
            return c;
        }

        if(n%10==0){
            return helper(n/10,++c);
        }
        return helper(n/10,c);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Count: "+count2(n));

    }
}

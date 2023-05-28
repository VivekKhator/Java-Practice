import java.util.*;

public class CountSteps {
    
    static int count(int n){
        return helper(n, 0);
    }

    static int helper(int n, int count){

        if(n==0){
            return count;
        }

        if(n%2==0){
            return helper(n/2, ++count);
        }
        return helper(n-1, ++count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(count(n));
    }
}

import java.util.Scanner;

public class Product1toN {
    
    static long product1toN(int n){
        if(n==1){
            return 1;
        }

        return n*(product1toN(n-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(product1toN(n));
    }
}

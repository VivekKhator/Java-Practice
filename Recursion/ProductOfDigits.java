import java.util.Scanner;

public class ProductOfDigits {
    
    static long productOfDigits(int n){

        if(n%10==n){
            return n;
        }

        int i = n%10; //4 //3 //2
        n = n/10; //23 //2 //0
        return i*productOfDigits(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(productOfDigits(n));
    }
}

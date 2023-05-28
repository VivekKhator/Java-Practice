import java.util.Scanner;

public class Print1toN {

    static void print1toN(int n){
        if(n==0){
            return;
        }

        System.out.println(n);
        print1toN(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        print1toN(n);
    }
}

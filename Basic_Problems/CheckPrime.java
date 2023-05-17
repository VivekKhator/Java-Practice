package Basic_Problems;

import java.util.Scanner;

public class CheckPrime {

    /*
      You are given a single positive integer, N. 
      You need to find and print whether N is Prime or not. 
    */

    static boolean isPrime(int n){

        for(int i=2; i<n; i++){
            if(n<=1){
                return false;
            }
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println(n + " is a prime number.");
        }
        else{
            System.out.println(n +" is not a prime number.");
        }
    }
}

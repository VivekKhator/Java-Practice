package Basic_Problems;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class FibbonacciNumberInRange {
    /*
      You are given a single non-negative integer, N. You need to print all numbers that:
        (i) occur in the range 0 to N (both inclusive)
        (ii) are a part of the fibonacci sequence
        Draw a flowchart for this process
      Note 1: The first two terms of the fibonacci sequence are 0 and 1.
     */


     static List<Integer> fibbonacci(int n){
        List<Integer> list = new ArrayList<>();
        int first = 0;
        int second = 1;
        list.add(first);

        if(n==0){
            return list;
        }

        list.add(second);

        if(n==1){
            return list;
        }

        
        return fibbonacci(n-1);
     }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fibbonacci(n));
     }
}

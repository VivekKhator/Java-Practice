package Strings;

import java.util.Scanner;

public class Palindrome {

    static boolean isPalinedrome(String s){
        return helper(s, 0, s.length()-1);
    }

    static boolean helper(String s, int start, int end){

        if(start>=end){
            return true;
        }
        if(s.charAt(start) != s.charAt(end)){
            return false;
        }
        return helper(s, start+1, end-1);
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(isPalinedrome(s));
    }
}

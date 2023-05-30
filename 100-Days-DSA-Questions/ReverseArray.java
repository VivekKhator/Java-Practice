package DSAProblems;

import java.util.Arrays;

/* Write a program to reverse an array */

public class ReverseArray {

    /* 
        Method-1 
        T(c) = O(n)
        S(c) = O(n) 
    */
    static String[] reverseBrute(String[] str){

        String[] s = new String[str.length];
        for(int i=str.length-1; i>=0; i--){
            s[str.length-1-i]=str[i];
        }

        return s;
    }

    /* 
        Method-2
        T(c) = O(n)
        S(c) = O(1)
    */
    static String[] reverseBetter(String[] str){

        for(int i=0; i<str.length/2; i++){
            String temp = str[i];
            str[i] = str[str.length-1-i];
            str[str.length-1-i] = temp;
        }
        return str;
    }

    
    public static void main(String[] args) {
        String[] str = {"G","E","E","K","S"};

        System.out.println("Before: "+Arrays.asList(str));
        String[] str2 = reverseBrute(str);
        System.out.println("After: "+Arrays.asList(str2));
    }
}

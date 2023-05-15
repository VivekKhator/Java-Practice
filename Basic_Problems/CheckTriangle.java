package Basic_Problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckTriangle {

    static int check(int a, int b, int c){

        if(a==b && b==c){
            return 1;
        }
        else if(a!=b && b!=c && c!=a){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        Integer a = Integer.parseInt(bf.readLine());
        Integer b = Integer.parseInt(bf.readLine());
        Integer c = Integer.parseInt(bf.readLine());

        System.out.println(check(a,b,c));

    }
}

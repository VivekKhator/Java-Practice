import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        
        /*

        * 
        * *
        * * *
        * * * *
        * * * * *          
        
        */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int row=1; row<n+1; row++){
            for(int col=0; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();   
        }
    }
}

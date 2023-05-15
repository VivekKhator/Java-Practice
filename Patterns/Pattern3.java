import java.util.Scanner;

public class Pattern3{
    public static void main(String[] args) {
        /*
              *
             ***
            *****
           *******
          ********* 
           
        */

        /*
         row = n
         
         nstar = 1, 3, 5, 7, 9
         nspace = 4, 3, 2, 1, 0
          
         
         */
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for(int row=0; row<n; row++){
            int nspace1 = n-1;
            // for space
            for(int nspace=n-1; nspace>0; nspace--){
                System.out.print(" ");
            }

            //for star
            for(int nstar=1; nstar<n; nstar+=2){
                System.out.print("*");
            }
            System.out.println();
            nspace1--;
            
        }

    }
}
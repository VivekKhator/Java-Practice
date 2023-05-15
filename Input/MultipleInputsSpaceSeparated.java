package Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleInputsSpaceSeparated {
    public static void main(String[] args) throws IOException{
        
        try{
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            String[] str = bf.readLine().split(" ");
    
            int[] nums = new int[2];
    
            for(int i=0; i<str.length; i++){
                nums[i] = Integer.parseInt(str[i]);
            }
    
            for(int i : nums){
                System.out.println(i);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please, enter only 2 numbers!!");
        }

    }
}

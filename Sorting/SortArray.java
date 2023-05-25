package Sorting;

import java.util.Arrays;

public class SortArray {

    public static void bubbleSort(int[] arr, int n){
        
        int turn = 0;
        int count = 0;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    count++;
                }
                
            }
            turn++;

            if(count==0){
                System.out.println("Array is already Sorted!!");
                break;
            }
        }
    }

    public static void printArray(int[] arr, int n){
        System.out.println("Array After Soring: " +Arrays.toString(arr));
    }

    public static void main(String[] args) {
        
        int[] arr1 = new int[]{0,-1,12,2,40,-3,16,79,9};
        int[] arr = new int[]{1,2,3,4,5,6,8}; 
        int n = arr.length;
        /* First, Greater element should set at it's correct position */
        
        System.out.println("Array before Sorting: "+Arrays.toString(arr));
        bubbleSort(arr, n);
        printArray(arr, n);        
        

        
    }
}

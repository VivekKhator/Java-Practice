package Arrays;

import java.util.Scanner;

public class LargestElement {

    static int largest(int[] a, int n){

        int largest = a[0];

        for(int i : a){
            if(largest<i){
                largest = i;
            }
        }
        return largest;
    }

    static int smallest(int[] a, int n){
        int smallest = a[0];

        for(int i : a){
            if(smallest>i){
                smallest = i;
            }
        }
        return smallest;
    }


    static int secondLargest(int[] a, int n){

        int largest = a[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i : a){
            if(i>largest){
                secondLargest = largest;
                largest = i;
            }
            if(i<largest){
                if(i>secondLargest){
                    secondLargest = i;
                }
            }
        }

        return secondLargest;
    }
    
    static int secondSmallest(int[] a, int n){

        int smallest=a[0];
        int secondSmallest = Integer.MAX_VALUE;

        for(int i : a){
            if(i<smallest){
                secondSmallest = smallest;
                smallest = i;
            }
            if(i>smallest){
                if(i<secondSmallest){
                    secondSmallest = i;
                }
            }
        }

        return secondSmallest;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = in.nextInt();
        }

        System.out.println("Largest: "+largest(a, n));
        System.out.println("Smallest: "+smallest(a, n));
        System.out.println("Second Largest: "+secondLargest(a, n));
        System.out.println("Second Smallest: "+secondSmallest(a, n));
    }
}

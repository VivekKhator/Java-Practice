package Arrays;

public class LinearSearch {

    static int linearSearch(int[] arr, int t){
        // return helperFirst(arr, t, 0);
        return helperLast(arr,t,arr.length-1);
    }

    static int helperLast(int[] arr, int t, int l){
        if(arr[l]==t){
            return l;
        }

        if(l==0){
            return -1;
        }

        return helperLast(arr, t, l-1);

    }

    static int helperFirst(int[] arr, int t, int i){

        if(arr[i]==t){
            return i;
        }
        if(i==arr.length-1){
            return -1;
        }

        return helperFirst(arr,t,i+1);
    }
    
    public static void main(String[] args) {
        int[] arr = {1,3,5,2,7,9,6,5,8,7};
        int target = 7;

        System.out.println("Index: "+linearSearch(arr, target));
    }
}

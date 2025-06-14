package array;
import java.util.Arrays;
// This code demonstrates how to swap two elements in an array

public class practice {
    public static void main(String[] args) {
        int []arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        reverse(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void reverse(int[]arr){
        int s=0;
        int e= arr.length-1;
        while(s<e){
            swap(arr,s,e);
            s++;
            e--;
        }
        System.out.println("after reverse:");
    }


    static void swap(int[]arr,int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }
}

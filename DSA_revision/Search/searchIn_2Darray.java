package Search;

import java.util.Arrays;

import array.max;

public class searchIn_2Darray {
    public static void main(String[] args) {
        int [][]    arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int target = 9;
        int ans []=search(arr, target);
        System.out.println(max(arr)); // This will print the max value in the 2D array
        // System.out.println(Arrays.toString(ans));
    }
    static int[] search (int [][]arr,int target){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==target){
                    return new int[]{row,col}; // Return the row and column index if found
                }
            }
        }
            return new int[]{-1,-1}; // Target not found in the 2D array
    }


    static int max (int [][]arr){
        int maxValue = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>maxValue){
                    maxValue = arr[row][col]; // Update maxValue if a larger value is found
                    // Return the row and column index if found
                }
            }
        }
            return maxValue; // Target not found in the 2D array
    }
}

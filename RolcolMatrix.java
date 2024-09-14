
import java.util.Arrays;

public class RolcolMatrix {

    public static void main(String[] args) {
        int [][]nums = {
            {10,20,30,40},
            {11,21,31,41},
            {12,22,32,42},
        };
        System.out.println(Arrays.toString(search(nums, 31)) );
        
    }
    // the matrix given is sorted and we need to find element in least time complexity.
    static int [] search( int arr[][],int target ){
        int r =0;
        int c = arr.length-1;
        while (r<arr.length && c>=0) {
            if (arr[c][r]== target) {
                return new int []{r,c};
            }
            if (arr[r][c]<target) {
                r++;
                
            }
            else{
                c--;
            }
            
        }
        return new int []{-1,-1};
    }
}
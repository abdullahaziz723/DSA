package array;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        String []nums = new String[4];
        Scanner in = new Scanner(System.in);
        // System.out.println(nums[0]);
        for(int i =0;i<nums.length;i++){
            nums[i]=in.next();      
        }
            System.out.println(Arrays.toString(nums));  


    }
}

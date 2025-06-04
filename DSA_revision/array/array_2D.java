package array;
import java.util.Scanner;
import java.util.Arrays;

public class array_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 2D array is an array of arrays
        /*
         * 1 2 3
         * 4 5 6
         * 7 8 9
         */
        // int [][] arr = new int [][];
        int[][] arr2 =  {
            {1, 2, 3},//0th index
            {4, 5, 6},//1st index
            {7, 8, 9}//2nd index
        };
        // input in 2d array

        // int [][] arr2 = new int[3][3];
        System.out.println(arr2.length);//number of rown will be2 given 


        for(int row =0;row<arr2.length;row++){
            //for each col in every row 
            for(int col=0;col<arr2[row].length;col++){
                arr2[row][col]=sc.nextInt();
            }
        }

        // for(int row =0;row<arr2.length;row++){
        //     //for each col in every row
        //     for(int col=0;col<arr2[row].length;col++){
        //         System.out.print(arr2[row][col]+" ");
        //     }
        //     System.out.println();
        // }

        //with to string method
        for(int row=0;row<arr2.length;row++){
            System.out.println(Arrays.toString(arr2[row]));
        }
        sc.close();


       
    }
}

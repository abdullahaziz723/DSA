package array;

public class max {
    public static void main(String[] args) {
        int []arr= {12,44,55,2,1,66};
        // System.out.println(max(arr)); 
        System.out.println(Maxrange(arr,2,5));
    }
    // imagine array is not empty
// find the maximum element in the array

// Time complexity: O(n)
// Space complexity: O(1)



    static int max (int[]arr){
        int max= Integer.MIN_VALUE; // or you can use arr[0] as the initial value
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                // update the max value
                max=arr[i];

            }
        }
        return max;
    }




    static int Maxrange(int[] arr,int start,int end){
        if(arr==null){
            return -1;
        }


        int maxval= Integer.MIN_VALUE; // or you can use arr[start] as the initial value
        for(int i =start;i<=end;i++){
            if(arr[i]>maxval){
                maxval=arr[i];
            }
        }
        return maxval;
    }
    
}

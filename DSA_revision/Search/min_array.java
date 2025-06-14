package Search;

public class min_array {
    public static void main(String[] args) {
            //find the minimum element in an array
            int []arr= {12,44,55,2,1,-7,66};
            System.out.println(min(arr));
    }


    static int min(int[]arr){
        int ans =arr[0];
        for(int i =1;i<arr.length;i++){
            if(arr[i]<ans){
                ans=arr[i];
            }
        }
        return ans;
    }
}

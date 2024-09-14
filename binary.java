public class binary {
    public static void main(String[] args) {
        int nums []={1,3,5,7,9,10,23};
       int ans =  binarysc(nums, 10);
        System.out.println(ans);
        
    }

    static int binarysc( int arr[],int target){
        int start =0;
        int end = arr.length-1;

        while (start<=end) {
            int mid = start + (end - start)/2;
            if (target< arr[mid]) {
                end = mid-1;
            }
            else if (target > arr[mid]) {
                start= mid+1;
            }
            else{
                return mid;
            }
            
        }
        return -1;
    }
}

package Search.Binary_search;
public class binary_search {
    public static void main(String []args){
        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target =5;
    int ans = binarysearch(arr, target);
    if(ans==-1){
        System.out.println("Target not found in the array");
    } else {
        System.out.println("Target found at index: " + ans);
    }

       
    }
    // return index
    //return -1 if noot found the target
    // Time complexity: O(log n)
    // Space complexity: O(1)
    static int binarysearch(int []arr ,int target){
        int start =0;
        int end = arr.length-1;
        while(start<=end){
            //find th middle element
            int mid = start + (end - start) / 2;
            

            if(target<arr[mid]){
                end = mid - 1; // search in the left half
            } else if(target>arr[mid]){
                start = mid + 1; // search in the right half
            } else {
                return mid; // target found
            }
        }
        return -1; // target not found
    }
}

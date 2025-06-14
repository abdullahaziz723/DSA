package Search;

public class linear_search {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target=81;
        // int ans = linear_search(arr, target);
        boolean ans2 = linear_search2(arr, target);
        System.out.println(ans2); // Output: true

        
    }
    //search in the array :return the index if item found
    static boolean linear_search2(int []arr,int target){
        if(arr.length == 0) {
            return false; // Array is empty
        }

        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if (element==target) {
                return true; // Return the element if found
            }

        }
        return false; // Target not found in the array
    }


    //otherwise if item not found return -1
    static int linear_search(int []arr,int target){
        if(arr.length == 0) {
            return -1; // Array is empty
        }

        for(int index=0;index<arr.length;index++){
            int element=arr[index];
            if (element==target) {
                return element; // Return the element if found
            }

        }
        return -1; // Target not found in the array
    }
}

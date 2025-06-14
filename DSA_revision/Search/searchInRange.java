package Search;

public class searchInRange {
    public static void main(String[] args) {
        int [ ]arr={1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target=5;
        int start=2;
        int end=6;
        int ans = linear_search(arr, target, start, end);
        System.out.println(ans);
        
    }
     static int linear_search(int []arr,int target,int start, int end){
        if(arr.length == 0) {
            return -1; // Array is empty
        }

        for(int index=start;index<end;index++){
            int element=arr[index];
            if (element==target) {
                return element; // Return the element if found
            }

        }
        return -1; // Target not found in the array
    }
}

package DSA;
public class linear {
    public static void main(String[] args) {
        int [] arrr = {12,2,44,11,99,88};
        // int target = 44;

        int ans = linears(arrr, 44);
        System.out.println(ans);

    }
    static int  linears(int arr [],int target){
        if (arr.length==0) {
            return -1;
        }
        for(int i=  0; i<arr.length;i++){
        int element = arr[i];
        if (element==target) {
            return i;
        }
        
    }
    return -1;

    }
        
    
}

package DSA;
public class no_of_digits {

    public static void main(String[] args) {
         int [] arr={1,21,34,56,1,678};
         System.out.println(findnumbers(arr));
        System.out.println( countnnums(-12345));


    }

    static int findnumbers(int []nums ){
        int count=0;
        for(int num : nums){
            if (even(num)) {
                count ++;
            }
        }
        return count;
    }
// funcrion to check whether number contains even number
 static boolean even( int num){
    int checkeven=countnnums(num);
    if (checkeven%2== 0) {
        return true;
        
    }
    return false;

 }
  
 static int countnnums(int n){
    int count = 0;
    if (n<0) {
        n=n*-1;
        
    }
    while (n>0) {
        count++;
        n=n/10;
       
    }
    return count;
 }
}
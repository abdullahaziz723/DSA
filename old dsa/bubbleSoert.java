import java.util.Arrays;
public class bubbleSoert {
 public static void main(String[] args) {

    int []nums ={2,67,-1,-88,4,21,90};
    Bubblesort(nums);
    System.out.println(Arrays.toString(nums));

   
    
 }   

 static void Bubblesort(int arr[]){
    boolean swapped;
// run steps for n-1 times
    for(int i =0; i<arr.length;i++){
        //for each step ,max item will come to the last index
        swapped = false;

        for( int j=1;j<arr.length-i;j++){
            //swap if THE ELEmwent is smaller than the previous element
            if (arr[j]<arr[j-1]) {
                int temp =arr[j] ;
                arr[j]=arr[j-1];
                arr [j-1]=temp;
                swapped =true;
            }

            // int temp =b;
            // b = a;
            //a= temp;
        }
        if (swapped ==false) {
            break;
        }
    }
 
    
 }
 
}

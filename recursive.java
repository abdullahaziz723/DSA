public class recursive {
 public static void main(String[] args) {
    int num =5;
    // fact(num)1x2x3x4x5
    System.out.println(fact(num));

 }  
 
 static int  fact (int n ){
    if(n==0){
        return 1;
    }
    else {
        return n *fact(n-1);
    }
 }
}

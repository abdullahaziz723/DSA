public class recursive {
 public static void main(String[] args) {
    int num =10     ;
    // fact(num)1x2x3x4x5
    System.out.println(fact(num));

 }  
 
 static int  fact (int n ){
    if(n<2){
        return n;
    }
    else {
        return fact(n-1)+fact(n-2);
        // return n *fact(n-1);
    }
 }
}

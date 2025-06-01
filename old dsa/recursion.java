public class recursion {
 public static void main(String[] args) {
    
recursive(1);

 }  
 static void recursive(int n){
    if(n==5){
        return ;
    }
    System.out.println(n);
    recursive(n+1);
 } 
}

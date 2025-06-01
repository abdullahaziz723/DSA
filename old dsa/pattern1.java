public class pattern1 {
    public static void main(String[] args) {
        pattern(5);
        
    }
    static void pattern(int n){
          for(int i =1;i<=n;i++){
            for(int col=1;col<=i;col++){
                System.out.print("*");
            }
            System.out.println("");
          }
          
    }
}

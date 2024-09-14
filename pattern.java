public class pattern {

     public static void main(String[] args) {
        // pattern_n(5);
        reverse_p(5);
        
     }
       static void reverse_p(int n){
        for(int row=1;row <=n;row++){
            for(int col =1;col<=n-row+1;col++){
                System.out.print("#");
            }
            System.out.println("");
        }
       }












     static void pattern_n(int n){
        for(int row =1;row<=n;row++){

            for(int col =1;col<=n;col++){
                System.out.print("*");
            }
            System.out.println("");
        }


     }
}
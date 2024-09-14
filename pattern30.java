public class pattern30 {
    public static void main(String[] args) {
        pattern30_(5);
        
    }
    static void pattern30_(int n){
        for(int i =1;i<=n;i++){

            for(int space = 0; space<=n-i;space++){
                System.out.print("  ");
            }
                for(int col = i;col>= 1;col--){
                    System.out.print(col+" ");

                }
                for(int col= 2;col<=i;col++){
                    System.out.print(col+" ");
                }
                System.out.println("");
        }
    }
}

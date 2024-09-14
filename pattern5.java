public class pattern5 {

    public static void main(String[] args) {
        pattern_5(6);
    }
    static void pattern_5(int n){
       for(int row=0;row<n*2;row++){
        int cols= row>n?2*n-row:row;
       int spaces= n- cols;
        for(int s = 0;s<spaces;s++){
            System.out.print(" ");
        }
       
        for(int col=0;col<cols;col++){
            System.out.print("*");
        }
        System.out.println();
       }
      
    }
}
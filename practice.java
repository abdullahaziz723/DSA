import java.util.Scanner;
public class practice{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int ans = prime(12);
        System.out.println(ans);
            sc.close();
        
    }
    static int prime(int n){
        int count=0;
        for(int i= 2; i<=Math.sqrt(n);i++ ){
            
            count++;
        }
        return count;
    }

}
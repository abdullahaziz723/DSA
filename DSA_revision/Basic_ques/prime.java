package Basic_ques;
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
            System.out.println(isprime(n));
        Sc.close();
    }

    static boolean isprime(int n){
        if(n<=1){
            return false;
        }

        int c=2;
        while(c*c<=n){
            if(n%c==0){
                return false;
               } c++;
            }
           
            if(c*c>n){
                return true;
            }
            return false;
        }
    }




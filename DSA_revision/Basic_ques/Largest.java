package Basic_ques;
import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // // find largest number 
        // int max = a;
        // if (b > max) {
        //     max = b;
        // }
        // if (c > max) {
        //     max = c;
        // }

        // System.out.println("the Largest number is "+ max);

          
        int max =   Math.max(c, Math.max(a,b));
        System.out.println(max);
        sc.close();
    }
}

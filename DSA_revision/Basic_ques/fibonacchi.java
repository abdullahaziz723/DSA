package Basic_ques;
import java.util.Scanner;

public class fibonacchi {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int  previous=0;
        int intial =1;
        int count=2;
        while(count<=n){
            int temp =intial;
            intial=intial+previous;
            previous=temp;
            count++;
        }

        System.out.println(intial);




        }
}

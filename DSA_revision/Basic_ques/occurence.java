package Basic_ques;
import java.util.Scanner;

public class occurence {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int count =0;
        while(n>0){
            int rem=  n %10;
            if(rem==7){
                count++;
            }
            n=n/10;
        }
        System.out.println(count);
        Sc.close();
    }
}

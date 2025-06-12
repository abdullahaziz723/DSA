package Basic_ques;
import java.util.Scanner;

public class case_check{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        char ch =sc.next().trim().charAt(0);


        // System.out.println(sc.next().trim());
        // sc.close();


        if(ch>='a'&& ch<='z'){
            System.out.println("lowercase   letter");   
        }
        else{
            System.out.println("uppercase letter");
        }
    }
}
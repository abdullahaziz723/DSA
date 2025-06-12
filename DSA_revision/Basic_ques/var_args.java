package Basic_ques;
public class var_args {
    public static void main(String[] args) {
        multiple(2, 01, 3, 4, 5, 6, 7, 8, 9);   
    }

    static void multiple(int a,int b, int ...c){
        System.out.println("the value of a is " + a);
        System.out.println("the value of b is " + b);
        System.out.println("the value of c is  "+c);   
    }
}


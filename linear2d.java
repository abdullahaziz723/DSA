
public class linear2d {

    public static void main(String[] args) {
        int nums [][]={
            {1,123,5,1,3},
            {5,7,351,8,35,1}
        };
        int ans= searchmax(nums);
        System.out.println(ans);  


    }
    static int  searchmax(int [][]arr ){
        int max = Integer.MIN_VALUE;
        for( int [] arrr: arr){
            for( int  element :arrr){
                if ( element> max){
                    max = element;
                    
                }
            }

        }
        return max;
    }
}
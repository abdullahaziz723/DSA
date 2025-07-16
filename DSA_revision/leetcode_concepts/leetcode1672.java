// LeetCode Problem: 1672. Richest Customer Wealth

public class leetcode1672 {

    public static void main(String[] args) {
        
        int [][]accounts = {
            {1,2,3},
            {3,2,1},
            {4,5,6}
        };

        System.out.println(maximumWealth(accounts)); // Output: 15
    }
    static int maximumWealth(int[][] accounts) {


        int ans=0;
        for(int i =0;i<accounts.length;i++){
             int sum =0;
            for(int j =0;j<accounts[i].length;j++){
                sum =sum+ accounts[i][j];
            }
            if(ans<sum){
                ans=sum;
            }
        }
        return ans;
    }
} 
    


public class LeetCode2566 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int num=11891;
        System.out.println(solution.minMaxDifference(num)); // Output: 99009

    }
}

/**
 *  
 * We want to transform a given integer into two different values:

One with the maximum value achievable by replacing a digit with '9'.
One with the minimum value by replacing a digit with '0'.
Then, return the difference between the two values.


Approach
Convert the number into a string so individual digits can be manipulated.
For the maximum number:
Find the first digit that is not '9'.
Replace all occurrences of this digit with '9'.
For the minimum number:
Replace all occurrences of the first digit with '0'.
Convert both strings back to integers and subtract to find the difference.
Complexity
Time complexity: O(n) where n is the number of digits (at most 10 for a 32-bit integer).
Space complexity: O(n) to store modified digit strings.
 * 
 */



class Solution {
    public int minMaxDifference(int num) {
        String str= Integer.toString(num);
        char []maxchars=str.toCharArray();
        char []minchars=str.toCharArray();
        
        char formax=' ';
        for(char c: maxchars){
              
            if(c!='9'){
                formax=c;
                break;
                // continue;
            }
        }

        for(int i =0;i<maxchars.length;i++){
            if(maxchars[i]==formax){
                maxchars[i]='9';
            }
        }
        char replaceformin=minchars[0];
        for(int i=0;i<minchars.length;i++){
            if(minchars[i]==replaceformin){
                minchars[i]='0';
            }
        }
        int maxval=Integer.parseInt(new String(maxchars));
        int minval=Integer.parseInt(new String(minchars));
        return maxval-minval;
    }
}
package Search;

import java.util.Arrays;

public class Search_In_strings {
    public static void main(String[] args) {
        String str ="hello world";
        char target = 'o';
        // String ans= search(str,target);
        // System.out.println(search(str, target));
        System.out.println(Arrays.toString(str.toCharArray()));
    }

   
    static boolean search2(String str,char target){
        if(str.length()==0){
            return false; // String is empty
        }
        for(char ch:str.toCharArray()){
            if(ch==target){
                return true; // Return true if character is found
            }
        }
        return false; // Character not found in the string
    }



    static boolean search(String str,char target){
        if(str.length()==0){
            return false; // String is empty
        }

        for(int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true; // Return true if character is found
            }
        }
        return false; // Character not found in the string
    }
}



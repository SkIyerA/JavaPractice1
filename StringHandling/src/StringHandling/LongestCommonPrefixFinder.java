package StringHandling;

import java.util.Arrays;

public class LongestCommonPrefixFinder {
    // Using StringBuilder
    public static String longestCommonPrefix(String[] strs) {
        if(strs ==null||strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length-1].toCharArray();
        for(int i=0;i<first.length;i++){
            if(last.length>i&& last[i]==first[i]){
                result.append(first[i]);
            }else{
                break;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"pkflower", "pflow", "pfloight"};
        System.out.println("Longest common prefix: " + longestCommonPrefix(strings));
    }
}


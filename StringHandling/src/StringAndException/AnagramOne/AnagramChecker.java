package StringAndException.AnagramOne;

import java.util.Arrays;

public class AnagramChecker {
    public static boolean areAnagrams(String str1,String str2) throws AnagramException{
        if(str1==null||str2==null){
            throw new AnagramException("Input strings cannot be null");
        }
        String s1= str1.replaceAll("\\s","").toLowerCase();
        String s2= str2.replaceAll("\\s","").toLowerCase();

        if(s1.length()!=s2.length()){
            throw new AnagramException("Strings are not of equal length");
        }

        char[] charArray1= s1.toCharArray();
        char[] charArray2= s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        return Arrays.equals(charArray1,charArray2);
    }
}

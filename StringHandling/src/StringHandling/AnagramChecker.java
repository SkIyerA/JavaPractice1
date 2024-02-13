package StringHandling;

import java.util.Arrays;

public class AnagramChecker {
    // Using StringBuilder
    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] char1= str1.toCharArray();
        char[] char2=str2.toCharArray();
        Arrays.sort(char1);
        Arrays.sort(char2);
        return Arrays.equals(char1,char2);
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams: " + isAnagram(str1, str2));
    }
}

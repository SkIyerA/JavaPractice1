package StringAndException.Palindrome;

import java.util.Scanner;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) throws PalindromeException{
        if(str==null||str.isEmpty()||str.equals("not")){
            throw new PalindromeException("Input string is either null or empty.");
        }
        int start=0;
        int end=str.length()-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = scanner.nextLine();

        try {
            if(isPalindrome(input)){
                System.out.println("The String is palindrome");
            }else{
                System.out.println("The string is not a palindrome");
            }
        }catch (PalindromeException e){
            System.out.println(e.getMessage());
        }

    }
}

package StringAndException.AnagramOne;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1= sc.nextLine();
        System.out.println("Enter String 2");
        String str2 = sc.nextLine();
        try{
            if(AnagramChecker.areAnagrams(str1,str2)){
                System.out.println("They are anagrams");
            }else{
                System.out.println("Not anagrams");
            }
        }catch (AnagramException e){
            System.out.println(e.getMessage());
        }

    }
}

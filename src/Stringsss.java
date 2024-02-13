import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Stringsss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first String");
        String first = sc.nextLine();
        System.out.println("Enter the second String");
        String second = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s!]+") ;
        Matcher matcher = pattern.matcher(first);
        Matcher matcher2 = pattern.matcher(second);

        if(matcher.matches() && matcher2.matches()){
            if(first.length()==second.length()){
                char[] arr = first.toCharArray();
                char[] arr2= second.toCharArray();
                char[] arr3 = new char[arr.length];
                for(int i=0;i<arr.length;i++){
                    if(arr[i]=='!'){
                        arr3[i]=arr2[i];
                    }else{
                        arr3[i]=arr[i];
                    }
                }
                System.out.println(new String(arr3));
            }else{
                System.out.println("first and second are of different lengths");
            }
        }else{
            if((!matcher.matches()&&(!matcher2.matches()))){
                System.out.println("Both words contain invalid symbols");
            }else if(!matcher.matches()){
                System.out.println(first+ " contains invalid symbols");
            }else{
                System.out.println(second+ " contains invalid symbols");
            }
        }
    }
}

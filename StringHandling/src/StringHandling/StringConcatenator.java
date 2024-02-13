package StringHandling;

import java.util.StringJoiner;

public class StringConcatenator {
    // Using StringBuilder
    public static String concatenateWithDelimiter(String delimiter, String... strings) {
        try{
            StringBuilder result = new StringBuilder();
            for(int i=0;i< strings.length;i++){
                result.append(strings[i]);
                if(i< strings.length-1){
                    result.append(delimiter);
                }
            }
            return result.toString();
        }catch (NullPointerException e){
            return null;
        }

    }

    // Using StringJoiner
    public static String concatenateWithJoiner(String delimiter, String... strings) {
        try{
            StringJoiner joiner = new StringJoiner(delimiter);
            for(String str:strings){
                joiner.add(str);
            }
            return joiner.toString();
        }catch (NullPointerException e){
            return null;
        }

    }

    public static void main(String[] args) {
        String[] strings = {"Java", "is", "fun"};
        String delimiter = "-";
        System.out.println("Using StringBuilder: " + concatenateWithDelimiter(delimiter, strings));
        System.out.println("Using StringJoiner: " + concatenateWithJoiner(delimiter, strings));
    }
}

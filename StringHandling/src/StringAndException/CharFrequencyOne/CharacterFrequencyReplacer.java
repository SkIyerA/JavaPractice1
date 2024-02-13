package StringAndException.CharFrequencyOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class CharacterFrequencyReplacer {
    public static String replaceWithFrequency(String str) throws StringManipulationException{
        if(str==null||str.isEmpty()){
            throw new StringManipulationException("Input string cannot be null or empty");
        }

        Map<Character,Integer> charCount = new HashMap<>();
        for(char c:str.toCharArray()){
            charCount.put(c,charCount.getOrDefault(c,0)+1);
        }

        StringBuilder replacedStr = new StringBuilder();

        for(char c:str.toCharArray()){
            int frequency = charCount.get(c);
            replacedStr.append(frequency);
        }
        return replacedStr.toString();
    }

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try{
            System.out.println("Enter a String");
            String input =scanner.nextLine();
            String result = replaceWithFrequency(input);
            System.out.println("String with characters replaced by their frequency is :"+result);
        }catch (StringManipulationException e){
            System.out.println("Error: "+e.getMessage());
        }catch (Exception e){
            System.out.println("An unexpected error occurred: "+e.getMessage());
        }finally {
            System.out.println("Done and dusted out of this world");
        }
    }
}

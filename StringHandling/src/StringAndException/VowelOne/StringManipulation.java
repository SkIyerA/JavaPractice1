package StringAndException.VowelOne;

import java.util.*;

public class StringManipulation {
    public static List<String> processSentence(String sentence) throws VowelWordException{
        List<String> words = Arrays.asList(sentence.split("\\s+"));
        List<String> vowelWords = new ArrayList<>();

        for(String word:words){
            char firstChar = word.charAt(0);
            if(isVowel(firstChar)){
                vowelWords.add(word.toUpperCase());
            }
        }

        if(vowelWords.isEmpty()){
            throw new VowelWordException("No words starting with a vowel found in the sentence");
        }


        Collections.sort(vowelWords);
        return vowelWords;
    }


    public static boolean isVowel(char c){
        return "AEIOUaeiou".indexOf(c)!=-1;  // returns the index in AEIOUaeiou(a positive value) where c occurs, if it is present. Else it returns -1.
    }

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String input = scanner.nextLine();

        try{
            List<String> result = processSentence(input);
            System.out.println("Words starting with a vowel(in upper case) sorted alphabetically");
            for(String word: result){
                System.out.println(word);
            }
        }catch (VowelWordException e){
            System.out.println(e.getMessage());
        }
    }
}

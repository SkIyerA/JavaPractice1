//find all possible substrings of a given string
package StringHandling;

import java.util.HashSet;
import java.util.Set;

public class SubstringFinder {
    // Using StringBuilder
    public static Set<String> findAllSubstrings(String input) {
        Set<String> substrings = new HashSet<>();
        for(int i=0;i<input.length();i++){
            for(int j=i+1;j<=input.length();j++){
                substrings.add(input.substring(i,j));
            }
        }
        return substrings;
    }

    public static void main(String[] args) {
        String input ="cat";
        Set<String> substrings = findAllSubstrings(input);
        System.out.println("All possible substrings of '" + input + "': " + substrings);
    }
}

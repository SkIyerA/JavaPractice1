package StringHandling;

public class DuplicateRemover {
    // Using StringBuilder
    public static String removeDuplicatesWithStringBuilder(String input) {
        try{
            StringBuilder result = new StringBuilder();
            for(int i=0;i<input.length();i++){
                char current = input.charAt(i);
                if(result.indexOf(String.valueOf(current))==-1){  //most String methods like indexOf need String as an argument. Here, char current is converted to String current  and it's index is returned
                    result.append(current);
                }
            }
            return result.toString();
        }catch (NullPointerException e){
            return null;
        }
    }

    // Using iterative approach
    public static String removeDuplicatesIteratively(String input) {
        if(input==null){
            throw new IllegalArgumentException("Input cannot be null");
        }
        StringBuilder result = new StringBuilder();
        boolean[] seen = new boolean[256]; //Assuming ASCII character
        for(char c:input.toCharArray()){
            if(!seen[c]){
                result.append(c);
                seen[c] =true;
            }
        }
        return result.toString();

    }

    public static void main(String[] args) {
        String input = "meganaborenajuge";
        System.out.println("Using StringBuilder: " + removeDuplicatesWithStringBuilder(input));
        System.out.println("Using iterative approach: " + removeDuplicatesIteratively(input));
    }
}


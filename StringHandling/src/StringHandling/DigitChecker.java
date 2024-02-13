package StringHandling;

public class DigitChecker {
    // Using String method

    public static boolean containsOnlyDigits(String input){
        try{
            Integer.parseInt(input);
            return true;

        }catch(NumberFormatException e){
            return false;
        }
    }

    // Using StringBuilder
    public static boolean containsOnlyDigitsWithStringBuilder(String input) {
        try{
            for(int i=0;i<input.length();i++){
                if(!Character.isDigit(input.charAt(i))){
                    return false;
                }
            }
            return true;
        }catch (NullPointerException e){
            return false;
        }
    }

    // Using iterative approach
    public static boolean containsOnlyDigitsIteratively(String input) {
        if(input==null){
            throw new IllegalArgumentException("Input cannot be null");
        }
        try{
            for(char c:input.toCharArray()){
                if(!Character.isDigit(c)){
                    return false;
                }
            }
            return true;
        }catch (NullPointerException e){
            return false;
        }
    }

    public static void main(String[] args) {
        String input = "1234A6";
        System.out.println("Using String method: " + containsOnlyDigits(input));
        System.out.println("Using StringBuilder: " + containsOnlyDigitsWithStringBuilder(input));
        System.out.println("Using iterative approach: " + containsOnlyDigitsIteratively(input));
    }
}


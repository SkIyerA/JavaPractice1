package StringAndException.PasswordOne;

import java.util.Random;

public class PasswordGenerator {

    private static final String LOWERCASE_LETTERS= "abcdefghijklmnoprstuvwxyz";
    private static final String UPPERCASE_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String DIGITS ="0123456789";
    private static final String SPECIAL_CHARACTERS="!@#$%^&*()-_+=";


    public static String generatePassword(int length, boolean includeLowerCase,boolean includeUpperCase, boolean inclueDigits,boolean includeSpecialCharacters) throws PasswordGenerationException{
        if(length<=0){
            throw new PasswordGenerationException("Password length must be greater than zero");
        }

        StringBuilder validChars = new StringBuilder(); //appends all the characters that can be included
        if(includeLowerCase){
            validChars.append(LOWERCASE_LETTERS);
        }

        if(includeUpperCase){
            validChars.append(UPPERCASE_LETTERS);
        }

        if(inclueDigits){
            validChars.append(DIGITS);
        }

        if(includeSpecialCharacters){
            validChars.append(SPECIAL_CHARACTERS);
        }

        if(validChars.length()<=0){
            throw new PasswordGenerationException("At least one type of character must be included");
        }
        System.out.println(validChars.length());
        Random random = new Random();
        StringBuilder password = new StringBuilder();
        for(int i=0;i<length;i++){
            int index= random.nextInt(validChars.length()); //chooses an index of the range 0 to the length of validChars
            password.append(validChars.charAt(index)); //appends to password the character at that particular index in validChars
        }
        return password.toString();
    }


}

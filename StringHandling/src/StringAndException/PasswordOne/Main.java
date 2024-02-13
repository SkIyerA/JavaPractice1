package StringAndException.PasswordOne;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter the length of the password:");
            int length = sc.nextInt();
            System.out.println("Include lowercase letter? true/false");
            boolean includeLowerCase = sc.nextBoolean();

            System.out.println("Include uppercase letters? true/false");
            boolean includeUpperCase = sc.nextBoolean();

            System.out.println("Include digits?true/false");
            boolean includeDigits = sc.nextBoolean();

            System.out.println("Include special characters?true/false");
            boolean includeSpecialChars = sc.nextBoolean();

            String password = PasswordGenerator.generatePassword(length,includeLowerCase,includeUpperCase,includeDigits,includeSpecialChars);
            System.out.println("Generated password: "+password);
        }catch (InputMismatchException e){
            System.out.println("Invalid input format. Please enter a valid input");
        }catch (PasswordGenerationException e){
            System.out.println(e.getMessage());
        }
    }
}

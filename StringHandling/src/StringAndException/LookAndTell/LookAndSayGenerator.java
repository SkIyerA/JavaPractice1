package StringAndException.LookAndTell;
import java.util.Scanner;
/*
Start with "1".
The next term is obtained by describing the previous term, which is "1" itself, so the next term becomes "11".
The next term describes "11" as "two ones", so the next term becomes "21".
The next term describes "21" as "one two, one one", so the next term becomes "1211".
And so on.
 */
public class LookAndSayGenerator {
    public static String generateLookAndSay(int n) throws LookAndSayException{
        if(n<=0){
            throw new LookAndSayException("Number of terms must be greater than zero");

        }

        String sequence="1";
        for(int i=0;i<n;i++){
            sequence=nextTerm(sequence);
        }
        return sequence;
    }

    public static String nextTerm(String sequence){
        StringBuilder result = new StringBuilder();
        int count=1;

        for(int i=1;i<sequence.length();i++){
            if(sequence.charAt(i)==sequence.charAt(i-1)){
                count++;
            }else{
                result.append(count).append(sequence.charAt(i-1));
                count=1;
            }
        }
        result.append(count).append(sequence.charAt(sequence.length()-1));
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the number of terms in the Look and Say sequence:");
            int n = scanner.nextInt();

            String lookAndSaySequence = LookAndSayGenerator.generateLookAndSay(n);
            System.out.println("Look and Say sequence:");
            System.out.println(lookAndSaySequence);
        } catch (LookAndSayException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Invalid input");
        } finally {
            scanner.close();
        }
    }
}

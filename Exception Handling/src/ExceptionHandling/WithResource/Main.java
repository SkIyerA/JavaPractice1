package ExceptionHandling.WithResource;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("Exception Handling/filename.txt"));){
            String line = reader.readLine();
            while(line!=null){
                if(line.matches(" ^(?=(?:[^aeiou]*[aeiou]){2}[^aeiou]*$)[a-zA-Z]*$")){
                    System.out.println(line);
                }else{
                    System.out.println(line+" does not match");
                }
                //System.out.println(line);
                line= reader.readLine();
            }
        }catch (IOException e){
            System.out.println("An IOException Occurred: "+e.getMessage());
        }
    }
}

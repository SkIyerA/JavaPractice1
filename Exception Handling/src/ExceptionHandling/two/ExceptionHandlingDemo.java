package ExceptionHandling.two;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo {
        public static void readFile(String filename) throws IOException, FileProcessingException {
            try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
                String line = reader.readLine();
                while(line!=null){
                    System.out.println(line);
                    line= reader.readLine();
                }
            }catch(IOException e){
                throw new FileProcessingException("Error reading file: "+e.getMessage());
            }
        }
}

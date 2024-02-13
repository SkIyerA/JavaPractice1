package ExceptionHandling.two;

import static ExceptionHandling.two.ExceptionHandlingDemo.readFile;

public class Handling {
    public static void main(String[] args) {
        try{
            //readFile("nonExistent.txt");

        }catch (ArithmeticException e){
            System.out.println("Custom File processing Exception "+ e.getMessage());
        }

        //divideNumbers(10,0);
    }
}

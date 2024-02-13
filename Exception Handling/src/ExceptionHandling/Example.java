package ExceptionHandling;

public class Example {
    public static void main(String[] args) {
        try{
            int result = divide(10,0);
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("Finally block executed");
        }
    }

    static int divide(int numerator, int denominator){
        return numerator/denominator;
    }
}

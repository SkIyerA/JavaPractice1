package ExceptionHandling.Four;
//custom exceptions should always extend the main exception class
public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }

}

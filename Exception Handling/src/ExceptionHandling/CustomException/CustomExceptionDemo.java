package ExceptionHandling.CustomException;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try{
            throwCustomException();
        }catch(CustomException e){
            System.out.println("Custom Exception Caught!");
            System.out.println("Error Code : "+ e.getErrorCode());
            System.out.println("Error Message : "+ e.getErrorMessage());
        }
    }

    public static void throwCustomException() throws CustomException{
        int errorCode = 404;
        String errorMessage = "Resource not found";
        throw new CustomException(errorCode,errorMessage);
    }
}

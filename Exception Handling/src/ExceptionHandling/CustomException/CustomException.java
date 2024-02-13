package ExceptionHandling.CustomException;

public class CustomException extends Exception {
    private int errorCode;
    private String errorMessage;


    public void setErrorCode(int errorCode){
        this.errorCode=errorCode;
    }

    public int getErrorCode(){
        return errorCode;
    }

    public void setErrorMessage(String errorMessage){
        this.errorMessage=errorMessage;
    }

    public String getErrorMessage(){
        return errorMessage;
    }

    public CustomException(int errorCode, String errorMessage){
        super(errorMessage);
        this.errorCode=errorCode;
        this.errorMessage=errorMessage;
    }


}

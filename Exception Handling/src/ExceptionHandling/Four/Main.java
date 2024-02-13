package ExceptionHandling.Four;


public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            //int c=a/b;
            //throw new Exception("Mimicking an Exception");  //this throws a new exception which cannot be caught by the Arithmetic Exception, so it's directly caught by the Exception e.
            //int ans =divide(a,b);
            throw new MyException("This is a custom exception");
        }catch (MyException e){  //e is an object(new Arithmetic exception)
            System.out.println(e.getMessage()); //get the message that's previously initialised using the super constructor
        }catch (ArithmeticException e){  //e is an object(new Arithmetic exception)
            System.out.println(e.getMessage());
        }catch (Exception e){  //e is an object(new Arithmetic exception)
            System.out.println("Normal Exception");
        }finally {
            System.out.println("This will always execute");
        }


    }
    static  int divide(int a, int b) throws ArithmeticException{ //throws used to declare an exception specifying that a method may throw exception
        //return a/b;
        if(b==0){
            throw new ArithmeticException("It's an arithmetic exception. Please do not divide by zero");
        }
        return a/b;
    }
}

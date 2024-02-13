package ExceptionHandling.one;

import java.util.HashSet;

import static ExceptionHandling.one.DataObject.performOperation;

public class complexHashSetExample {
    public static void main(String[] args) {
        HashSet<DataObject> dataObjectSet = new HashSet<>();

        dataObjectSet.add(new DataObject(10));
        dataObjectSet.add(new DataObject(11));

        try{
            int result = performOperation(dataObjectSet);
            System.out.println("Result of operation "+result );
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }catch(CustomHashSetException e){
            System.out.println(e.getMessage());
            try{
                throw new CustomHashSetException("Nested Custom Exception");
            }catch(CustomHashSetException nestedException){
                System.out.println(nestedException.getMessage());
            }finally{
                System.out.println("Finally block Executed");
            }
        }

    }

    static class CustomHashSetException extends Exception{
        public CustomHashSetException(String message){
            super(message);
        }
    }
}

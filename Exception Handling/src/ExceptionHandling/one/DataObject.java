package ExceptionHandling.one;

import java.util.Arrays;
import java.util.HashSet;

class DataObject {
    private int value;

    public DataObject(int value){
        this.value=value;
    }

    public int getValue(){
        return value;
    }


    public static int performOperation(HashSet<DataObject> dataObjectSet) throws complexHashSetExample.CustomHashSetException {
        int total =0;
        for(DataObject dataObject : dataObjectSet){
            if(dataObject.getValue()==0){
                throw new ArithmeticException("Division by Zero");
            }

            if(dataObject.getValue()==5){
                throw new NullPointerException("Null Pointer Exception");
            }

            if(dataObject.getValue()==10){
                throw new complexHashSetExample.CustomHashSetException("Custom Exception");
            }

            total+=100/ dataObject.getValue();
        }
        return total;


    }
}

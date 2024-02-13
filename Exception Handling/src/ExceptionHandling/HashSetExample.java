package ExceptionHandling;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(10);
        numberSet.add(40);
        numberSet.add(30);
        try {
            performHashSetOperation(numberSet);
        } catch (ArithmeticException | NullPointerException e) {
            throw e;
        }
    }

    static void performHashSetOperation(HashSet<Integer> numberSet){


        try{
            int result = performOperation(numberSet);
            System.out.println("Result of Operation:" + result);
        }catch (ArithmeticException|NullPointerException e){
            throw e;
        }
    }


    static int performOperation(HashSet<Integer> numberSet){
        int total =0;
        for(Integer num:numberSet){
            total+= 100/num;

            if(num==20){
                throw new NullPointerException("Null Pointer Exception");
            }
        }

        return total;
    }
}

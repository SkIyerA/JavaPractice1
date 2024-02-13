package ExceptionHandling;

import java.util.HashSet;

public class HashSetExample2 {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(20);
        numberSet.add(0);
        numberSet.add(50);

        System.out.println("Hash set"+ numberSet);
        try{
            performHashSetOperation(numberSet);
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception caught: "+ e.getMessage() );
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception caught: "+ e.getMessage());
        }finally {
            System.out.println("Finally Block Executed");
        }
    }

    static void performHashSetOperation(HashSet<Integer> numberSet){
        try{
            int result = performOperation(numberSet);
            System.out.println("Result of Operation:" + result);
        }catch (ArithmeticException e){
            throw e;
        }catch (NullPointerException e){
            throw e;
        }
    }

    static int performOperation(HashSet<Integer> numberSet){
        int total =0;
        for(Integer num:numberSet){
            total+= 100/num;

            if(num==60){
                throw new NullPointerException("Null Pointer Exception");
            }
        }

        return total;
    }
}

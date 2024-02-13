import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class one {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","my","grape","mango");

        words.forEach(System.out::println);

        //filter words longer than 5 characters.

        List<String> wordFive = words.stream()
                .filter(w->w.length()>5)
                .toList();

        System.out.println("words having more than five letters are: "+ wordFive);

        Pattern pattern = Pattern.compile("[aeiou]");
        System.out.print("The words with vowels are ");
        for(String word:words){
            Matcher matcher = pattern.matcher(word);
            if(matcher.find()){
                System.out.print(word+" ");
            }
        }


        List<String> lo = Arrays.asList("A", "B", "C", "D");
        long count = lo.stream().peek(System.out::println).count();
        System.out.println("The count is " +count);


        List<Integer> wordLength = wordFive.stream().map(l->l.length()).collect(Collectors.toList());

        try{
            int divisor = wordLength.get(0);
            int result =10/divisor;
            System.out.println("Result of division: "+result);
        }catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }finally {
            System.out.println("Finally block executed");
        }

    }

}
/* aggregate operations -> filter, map, reduce, find, match,sort

2 interface to generate streams -> stream() and parallelstream()

intermediate methods-> distinct,limit, sorted, filter, min,max

terminal
aggregate operations-> sum, average, min,max
double total = employees.stream().collect(Collectors.summingDouble(Employee::getSalary));
summingInt
Collectors.averagingDouble()

sout("Employee name: "+ employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))).get().getEmpName())
minBy

List<Employee> list = employees.stream().filter(e->e.getEmpName).startsWith("t")).collect(Collectors.toList());
 */

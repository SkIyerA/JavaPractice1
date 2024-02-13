import java.util.regex.Matcher;
import java.util.regex.Pattern;

//^(?!.*(?:root|admin|pika))[a-zA-Z0-9_$]{5,10}$ -> when you don't want root or admin anywhere in the string.
//^((?!root|admin)[a-zA-Z0-9_$]){5,10} -> when you don't want root or admin at the start of the string
public class oneExample {
    public static void main(String[] args) {

       // Pattern pattern = Pattern.compile("^(?!.*(?:root|admin|pika))[a-zA-Z0-9_$]{5,10}$");
        Pattern pattern = Pattern.compile("^#([A-Z]{4})(\\d{3})$");
        String name = "#ABCD123";
        Matcher matcher = pattern.matcher(name);
        if(matcher.matches()){
            System.out.println("it matches");
        }
        if(matcher.find()){
            String match = matcher.group();
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);

            System.out.println(group1);
        }else{
            System.out.println("Not a match");
        }

    }
}

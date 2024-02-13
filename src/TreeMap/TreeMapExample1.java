package TreeMap;

import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TreeMapExample1 {
    public static void main(String[] args) {
        TreeMap<String,Integer> treeMap = new TreeMap<>();
        treeMap.put("One",1);
        treeMap.put("Two",2);
        treeMap.put("Three",3);
        treeMap.put("Four",4);


        System.out.println("Tree Map "+treeMap);
        System.out.println("Value for key 'Three':" + treeMap.get("Three"));
        System.out.println("Iterating through tree map: ");
        for(Map.Entry<String,Integer> entry : treeMap.entrySet()){
            System.out.println(entry.getKey()+"->" + entry.getValue());
        }
        String name = "#KING4567";
        Pattern pattern = Pattern.compile("#([A-Z]{4})([0-9]{3})");
        Matcher matcher = pattern.matcher(name);
        if(matcher.find()){
            String match = matcher.group();
            String group1 = matcher.group(1);
            String group2 = matcher.group(2);

            System.out.println(match+ group1+ group2);
        }else{
            System.out.println("Not a match");
        }



    }
}

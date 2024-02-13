package TreeSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> dictionary = new TreeSet<>();
        dictionary.add("kiwi");
        dictionary.add("Apple");
        dictionary.add("Orange");
        dictionary.add("Banana");
        dictionary.add("Ananas");
        dictionary.add("Grapes");
        dictionary.add("Avacado");

        System.out.println("Tree Set: "+dictionary);

        System.out.println("Dictionary in Alphabetical Ordewr");
        for(String word:dictionary){
            System.out.println(word);
        }

        dictionary.forEach((word)->System.out.println(word));  //Lambda Expression

        dictionary.forEach(System.out::println);  //method interface

        Iterator<String> iter = dictionary.iterator();
        System.out.println("With forEachRemaining of Iterator class");
        iter.forEachRemaining(l-> System.out.print(l + " "));
    }
}

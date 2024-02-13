package TreeMap;



import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("orange","apple","banana","apple","orange","apple","banana");
        TreeMap<String, Integer> wordFrequencyMap = new TreeMap<>();
        for(String word:words){
            wordFrequencyMap.put(word,wordFrequencyMap.getOrDefault(word,0)+1);
        }
        System.out.println("word Frequency map"+ wordFrequencyMap);
        System.out.println("Word Frequencies :");

        for(Map.Entry<String,Integer> entry:wordFrequencyMap.entrySet()){
            String word = entry.getKey();
            Integer frequency = entry.getValue();
            System.out.println(word+" : "+ frequency);
        }

        Set<Map.Entry<String,Integer>> entry = wordFrequencyMap.entrySet();
        for(Map.Entry<String,Integer> ent:entry){
            System.out.println(ent.getKey()+" "+ent.getValue());
        }


        Iterator<String> keyIterator = wordFrequencyMap.keySet().iterator();
        System.out.println("Iteration using keySet");
        while(keyIterator.hasNext()){
            String key = keyIterator.next();
            Integer value = wordFrequencyMap.get(key);
            System.out.println(key + " "+ value);

        }
        System.out.println("using forEach");
        wordFrequencyMap.forEach((key,value)-> System.out.println(key+" " + value));
     }
}

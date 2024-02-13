package TreeMap;

import java.util.*;

public class StudentAverageCalculator {
    public static void main(String[] args) {
        Map<String, List<Integer>> studentScores = new TreeMap<>();
        studentScores.put("Bob", Arrays.asList(75,80,92,88));
        studentScores.put("Alice",Arrays.asList(85,90,78,92));
        studentScores.put("Charlie",Arrays.asList(92,88,95,89));

        System.out.println("Average Scores: ");
        for(Map.Entry<String,List<Integer>> entry: studentScores.entrySet()){
            String studentName = entry.getKey();
            List<Integer> scores = entry.getValue();
            double averageScore = calculateAverage(scores);

            System.out.println(studentName + ":" + averageScore);
        }
    }

    private static double calculateAverage(List<Integer> scores){
        int sum=0;
        for(int score:scores){
            sum+=score;
        }
        return (double)sum/scores.size();
    }
}

// Day 16 - Breaking the Records

import java.util.ArrayList;
import java.util.List;

public class Day16 {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        int bestScore = scores.get(0);
        int bestScoreCount = 0;
        
        int worstScore = scores.get(0);
        int worstScoreCount = 0;
        
        for (Integer score : scores) {
            if(score > bestScore) {
                bestScore = score;
                bestScoreCount++;
            } else if(score < worstScore) {
                worstScore = score;
                worstScoreCount++;
            }
        }
        
        List<Integer> result = new ArrayList<>();
        result.add(bestScoreCount);
        result.add(worstScoreCount);

        return result;
    }

    public static void main(String[] args) { 
        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1); 
        
        List<Integer> result = breakingRecords(scores); 
        
        System.out.println(result); 
    }
}

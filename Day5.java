// Day 5 - Compare triplets

import java.util.ArrayList;
import java.util.List;

public class Day5 {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        int aliceScore = 0;
        int bobScore = 0;
        
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                aliceScore++;
            } else if(a.get(i) < b.get(i)) {
                bobScore++;
            }
        }
        
        List<Integer> score = new ArrayList<>();
        score.add(aliceScore);
        score.add(bobScore);
        
        return score;
    }

    public static void main(String[] args) {
        List<Integer> a = List.of(5, 6, 7);
        List<Integer> b = List.of(3, 6, 10);
        
        List<Integer> result = compareTriplets(a, b);
        System.out.println(result); // Output: [1, 1]
    }
}
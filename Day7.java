// Day 7 - Diagonal Difference

import java.util.List;

public class Day7 {
    public int diagonalDifference(List<List<Integer>> arr) {
        int diagonal1Sum = 0;
        int diagonal2Sum = 0;
        int n = arr.size();

        for (int i = 0; i < n; i++) {
            diagonal1Sum += arr.get(i).get(i);
            diagonal2Sum += arr.get(i).get(n - 1 - i);
        }

        return Math.abs(diagonal1Sum - diagonal2Sum);
    }

    public static void main(String[] args) {
        Day7 day7 = new Day7();

        List<List<Integer>> arr = List.of(
            List.of(11, 2, 4),
            List.of(4, 5, 6),
            List.of(10, 8, -12)
        );
        
        int result = day7.diagonalDifference(arr);

        System.out.println(result); // Output: 15
    }
}

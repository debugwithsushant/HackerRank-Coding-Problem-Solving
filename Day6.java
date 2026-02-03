// Day 6 - A Very Big Sum

import java.util.List;

public class Day6 {
    public long aVeryBigSum(List<Long> ar) {
        long sum = 0;

        for (Long num : ar) {
            sum += num;
        }

        return sum;
    }

    public static void main(String[] args) {
        Day6 day6 = new Day6();
        List<Long> ar = List.of(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L);
        
        long result = day6.aVeryBigSum(ar);
        System.out.println(result); // Output: 5000000015
    }
}

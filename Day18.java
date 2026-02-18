// Day 18 - Divisible Sum Pairs

import java.util.List;

class Day18 {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        int count = 0;
        
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                int sum = ar.get(i) + ar.get(j);
                if(sum % k == 0) {
                    count++;
                }
            }
        }
        
        return count;
    }

    public static void main(String[] args) { 
        int n = 6; 
        int k = 3; 
        List<Integer> ar = List.of(1, 3, 2, 6, 1, 2); 
        
        int result = divisibleSumPairs(n, k, ar); 
        
        System.out.println(result); 
    }
}
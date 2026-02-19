// Day 22 - Sales by Match

import java.util.List;

public class Day22 {
    public static int sockMerchant(int n, List<Integer> ar) {
        int pairs = 0;
        int[] freq = new int[101];
        
        for(int color : ar) {
            freq[color]         ++;   
        }
        
        for(int count : freq) {
            pairs += count / 2;
        }
        
        return pairs;
    }

    public static void main(String[] args) { 
        int n = 9; 
        List<Integer> ar = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20); 
        
        int result = sockMerchant(n, ar); 
        System.out.println(result);
    }
}

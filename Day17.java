// Day 17 - Subarray Division

import java.util.List;

public class Day17 {
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        
        if(m > s.size()) {
            return 0;
        }
        
        for(int i = 0; i <= s.size() - m; i++) {
            int sum = 0;
            
            for(int j = i; j < i + m; j++) {
                sum += s.get(j);
            }
            
            if(sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) { 
        List<Integer> s = List.of(1, 2, 1, 3, 2); 
        int d = 3; 
        int m = 2; 
        
        int result = birthday(s, d, m); 
        
        System.out.println(result); 
    }
}

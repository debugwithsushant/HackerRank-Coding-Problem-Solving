// Day 15 - Between Two Sets

import java.util.List;

public class Day15 {
    static int gcd(int a, int b) {
        while(b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }
    
    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int lcmA  = a.get(0);
        for(int i = 1; i < a.size(); i++) {
            lcmA = lcm(lcmA, a.get(i));
        }
        
        int gcdB = b.get(0);
        for(int i = 1; i < b.size(); i++) {
            gcdB = gcd(gcdB, b.get(i));
        }
        
        int count = 0;
        for(int x = lcmA; x <= gcdB; x += lcmA) {
            if(gcdB % x == 0) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) { 
        List<Integer> a = List.of(2, 4); 
        List<Integer> b = List.of(16, 32, 96); 
        
        int result = getTotalX(a, b); 
        
        System.out.println(result); 
    }
}

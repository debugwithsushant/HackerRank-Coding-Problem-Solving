// Day 13 - Apple and Orange

import java.util.List;

public class Day13 {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countApples = 0;
        int countOranges = 0;
        
        for(int apple : apples) {
            if(s <= (apple + a) && (apple + a) <= t) {
                countApples++;
            }
        }
        
        for(int orange : oranges) {
            if(s <= (orange + b) && (orange + b) <= t) {
                countOranges++;
            }
        }

        System.out.println("Apples: " + countApples);
        System.out.println("Oranges: " + countOranges);
    }

    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        List<Integer> apples = List.of(-2, 2, 1);
        List<Integer> oranges = List.of(5, -6);
        
        countApplesAndOranges(s, t, a, b, apples, oranges);
    }
}

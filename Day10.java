// Day 10 - Birthday Cake Candles

import java.util.List;

public class Day10 {
    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int maxHeight = candles.get(0);
        
        for(int i = 1; i < candles.size(); i++) {
            if(candles.get(i) > maxHeight) {
                maxHeight = candles.get(i);
            }
        }
        
        for (Integer candleHeight : candles) {
            if(candleHeight == maxHeight) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        List<Integer> candles = List.of(3, 2, 1, 3);
        int result = birthdayCakeCandles(candles);
        System.out.println(result);
    }
}

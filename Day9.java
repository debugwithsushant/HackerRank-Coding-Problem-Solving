// Day 9 - Min-Max Sum

import java.util.Collections;
import java.util.List;

public class Day9 {
    public static void miniMaxSum(List<Integer> arr) {
        Collections.sort(arr);
        
        long minSum = 0;
        long maxSum = 0;
        
        for(int i = 0; i < arr.size() - 1; i++) {
            minSum += arr.get(i);
        }
        
        for(int i = 1; i < arr.size(); i++) {
            maxSum += arr.get(i);
        }
        
        System.out.println(minSum + " " + maxSum);        
    }

    public static void main(String[] args) {
        List<Integer> arr = List.of(1, 2, 3, 4, 5);
        miniMaxSum(arr);
    }
}

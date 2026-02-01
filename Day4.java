// Day 4 - Array sum

import java.util.List;

class Day4 {
    public int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        
        for (int num : ar) {
            sum += num;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Day4 day4 = new Day4();
        List<Integer> arr = List.of(1, 2, 3, 4, 10, 11);
        System.out.println(day4.simpleArraySum(arr)); // Output: 31
    }
}

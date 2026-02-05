// Day 8 - Plus Minus

public class Day8 {
    public void plusMinus (List<Integer> arr) {
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int n = arr.size();

        for (int num : arr) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.printf("%.6f%n", (double) positiveCount / n);
        System.out.printf("%.6f%n", (double) negativeCount / n);
        System.out.printf("%.6f%n", (double) zeroCount / n);
    }

    public static void main(String[] args) {
        Day8 day8 = new Day8();

        List<Integer> arr = List.of(-4, 3, -9, 0, 4, 1);
        
        day8.plusMinus(arr);
        // Output:
        // 0.500000
        // 0.333333
        // 0.166667
    }
}